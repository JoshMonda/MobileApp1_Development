package com.example.studentmarks;

import java.util.ArrayList;
import java.util.List;

public class Marks {

    public String admNo, name;
    public int position, maths, eng, kisw, chem, hist, phys, bio, agri, cre, geo, hs, comp, total;

    public Marks() {
    }

    public Marks(String admNo, String name, int position, int maths, int eng, int kisw, int chem, int hist, int phys, int bio, int agri, int cre, int geo, int hs, int comp, int total) {
        this.admNo = admNo;
        this.name = name;
        this.position = position;
        this.maths = maths;
        this.eng = eng;
        this.kisw = kisw;
        this.chem = chem;
        this.hist = hist;
        this.phys = phys;
        this.bio = bio;
        this.agri = agri;
        this.cre = cre;
        this.geo = geo;
        this.hs = hs;
        this.comp = comp;
        this.total = total;
    }

    public String getAdmNo()

    {
        return admNo;
    }

    public void setAdmNo(String admNo) {
        this.admNo = admNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPosition()
    {
        return position;
    }

    public void setPosition(int position)
    {
        this.position = position;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getKisw() {
        return kisw;
    }

    public void setKisw(int kisw) {
        this.kisw = kisw;
    }

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    public int getHist() {
        return hist;
    }

    public void setHist(int hist) {
        this.hist = hist;
    }

    public int getPhys() {
        return phys;
    }

    public void setPhys(int phys) {
        this.phys = phys;
    }

    public int getBio() {
        return bio;
    }

    public void setBio(int bio) {
        this.bio = bio;
    }

    public int getAgri() {
        return agri;
    }

    public void setAgri(int agri) {
        this.agri = agri;
    }

    public int getCre() {
        return cre;
    }

    public void setCre(int cre) {
        this.cre = cre;
    }

    public int getGeo() {
        return geo;
    }

    public void setGeo(int geo) {
        this.geo = geo;
    }

    public int getHs() {
        return hs;
    }

    public void setHs(int hs) {
        this.hs = hs;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    public int getTotal() {
        this.total = calcTotal();
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int calcTotal(){
        return  maths + eng + kisw + chem + hist + phys + bio + agri + cre + geo  + hs + comp;
    }
   public List<Marks>GetMarks()
   {
        List<Marks> list= new ArrayList<Marks>();

        list.add(new Marks("ADM/01", "Joash Monda", 111, 50, 34,
                60, 70, 80, 74, 46, 66, 89, 94, 98, 40, 0));
        list.add(new Marks("ADM/02", "John Kemboi", 111, 50, 34,
                50, 70, 80, 74, 46, 66, 89, 94, 98, 40, 0));
        list.add(new Marks("ADM/03", "Steve Maingi", 111, 50, 34,
                70, 70, 80, 74, 46, 66, 89, 94, 98, 40, 0));
        list.add(new Marks("ADM/04", "Victor Kones", 111, 50, 34,
                80, 70, 80, 74, 46, 66, 89, 94, 98, 40, 0));
        list.add(new Marks("ADM/05", "Victor Langat", 111, 50, 34,
                90, 70, 80, 74, 46, 66, 89, 94, 98, 40, 0));
        list.add(new Marks("ADM/06", "Angela Ochiko", 111, 50, 34,
                50, 70, 80, 74, 46, 66, 89, 94, 98, 40, 0));
        list.add(new Marks("ADM/07", "Robert Kahagia", 111, 50, 34,
                60, 70, 80, 74, 46, 66, 89, 94, 98, 40, 0));
        list.add(new Marks("ADM/08", "Brandon Samaga", 111, 50, 34,
                60, 70, 80, 74, 46, 66, 89, 94, 98, 40, 0));
        list.add(new Marks("ADM/09", "Susan Otieno", 111, 50, 34,
                56, 70, 80, 74, 46, 66, 89, 94, 98, 40, 0));
        list.add(new Marks("ADM/010", "Elinus Kathambi", 111, 50, 34,
                60, 70, 80, 74, 46, 66, 89, 94, 98, 40, 0));

        return list ;

    }
}
