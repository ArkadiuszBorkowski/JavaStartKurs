package TextBlocks;

class TextBlocks {
    public static void main(String[] args) {
        String searchTitle = "W pustyni i w puszczy";
        String sql =
                "SELECT" +
                        "id, title, description" +
                "FROM" +
                        "books" +
                "WHERE" +
                        "title = '%s'";
        sql = sql.formatted(searchTitle);
        System.out.println(sql);


    }
}
