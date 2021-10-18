/*
Chloe Antonozzi
1670980

16/10/2021
Solve a maze
*/

class AmazingCaseTile{
    static final Tile ME = new Tile('@');
    static final Tile EXIT = new Tile('>');
    static final Tile CRUMB = new Tile('.');
    static final Tile EMPTY = new Tile(' ');
    static final Tile PATH = new Tile('o');
    static final Tile WALL = new Tile('#');

    final int RNUM; // number of rows of the maze
    final int CNUM; // number of collums of the maze
    Tile maze[][];

    Pair exit; // location of exit in the maze
    Pair me; // my location in the maze

    // assumes all Strings in map are of the same length
    AmazingCaseTile(String[] map){
        RNUM = map.length;
        CNUM = map[0].length();
        maze = new Tile[RNUM][CNUM];

        for (int r=0; r < RNUM; r++){
            char[] row = map[r].toCharArray();
            for (int c = 0; c < CNUM; c++){
                maze[r][c] = tileFromChar(row[c]);
                if (maze[r][c] == EXIT){
                    exit = new Pair(r, c);
                }else if (maze[r][c] == ME){
                    me = new Pair(r, c);
                }
            }
        }
    }

    AmazingCaseTile(){
        // maze defined by hard-wired map
        this(new String[]{
            "##########",
            "#@    #  #",
            "### ### ##",
            "#   #    #",
            "# #   # >#",
            "##########",
        }
        );
    }

    Tile tileFromChar(char c){
        switch(c){
            case '#' : return WALL;
            case ' ' : return EMPTY;
            case '>' : return EXIT;
            case '@' : return ME;
            default : return EMPTY;
        }
    }

    void solve(){
        if (explore()){
            print("I am saved!");
        }else{
            print("I am lost!");
        }
    }

    void print(String suffix){
        for (int r =0; r< maze.length; r++){
            for (int c = 0; c < maze[r].length; c++){
                if (me.r == r && me.c == c){
                    System.out.print(ME.show());
                }else{
                    System.out.print(maze[r][c].show());
                }
            }
            System.out.println();
        }
        System.out.println(suffix);
        pause(0.4);
    }

    void print() {print("");}

    void pause(double s){
        try{ Thread.sleep((long)(s * 1000));} catch(InterruptedException e) {}
    }

    boolean isFree(Pair p){
        Tile t = maze[p.r][p.c];
        return t == EMPTY || t == EXIT;
    }

    boolean withinBounds(Pair p){
        return 0 <= p.r && p.r < RNUM && 0<= p.c && p.c<CNUM;
    }

    boolean explore(){
        // maze[me.r][me.c] = ME;
        print();

        if (me.r == exit.r && me.c == exit.c){
            return true;
        }

        Pair[] nexts = {new Pair(me.r - 1, me.c),
                        new Pair(me.r ,me.c - 1),
                        new Pair(me.r + 1, me.c),
                        new Pair(me.r, me.c + 1),};
        
        for (int i = 0; i < nexts.length; i++){
            Pair next = nexts[i];
            //if (withinBounds(next[i]) && isFree(next[i]))
            if (withinBounds(next) && isFree(next)){
                maze[me.r][me.c] = PATH;
                Pair oldMe = me;
                boolean hasExit = explore();

                if (hasExit){
                    return true;
                }else{
                    // backtracking
                    maze[next.r][next.c] = CRUMB;
                    me = oldMe;
                    print();
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        (new AmazingCaseTile()).solve();
    }
}

class Tile{
    char view;

    Tile(char c){
        view = c;
    }

    String show() {
        return view+"";
    }
}

class Pair{
    int r; // row index
    int c; // column index

    Pair(int r, int c){
        this.r = r;
        this.c = c;
    }
}
