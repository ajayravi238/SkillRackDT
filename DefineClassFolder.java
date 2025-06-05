class Folder {
    private Map<String, List<String>> fm;
    
    public Folder() {
        fm = new TreeMap<>();
    }
    
    public void addFile(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        String name = fileName.substring(0, dotIndex);
        String extension = fileName.substring(dotIndex);
        
        if(fm.containsKey(extension)) {
            fm.get(extension).add(name);
        }else {
            List<String> li = new ArrayList<>();
            li.add(name);
            fm.put(extension, li);
        }
    }
    public void printStatus() {
        for(String ex : fm.keySet()) {
            System.out.print(ex + " - ");
            List<String> names = fm.get(ex);
            for(String file : names) {
                System.out.print(file + " ");
            }
            System.out.println();
        }
    }
}
