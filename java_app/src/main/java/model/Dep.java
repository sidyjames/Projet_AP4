/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collection;
import java.util.TreeSet;
import java.util.HashSet;

/**
 *
 */
public class Dep implements Comparable<Dep> {

    private String num;
    private Collection<Med> lesMeds = new TreeSet<Med>();

    public Dep(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public Collection<Med> getLesMeds() {
        return lesMeds;
    }

    public void addUnMed(Med unMed) {
        lesMeds.add(unMed);
    }

    public Collection getLesMedsR(String med) {
        Collection<Med> medSearch = new HashSet<Med>();
        for (Med unMed : lesMeds) {
            if (unMed.getNom().startsWith(firstLetterCaps(med))) {
                medSearch.add(unMed);
            }
        }
        return medSearch;
    } 

    public String firstLetterCaps(String data) {
        String firstLetter = data.substring(0, 1).toUpperCase();
        String restLetters = data.substring(1).toLowerCase();
        return firstLetter + restLetters;
    }

    @Override
    public int compareTo(Dep d) {
        return num.compareTo(d.num);
    }

	public void setNum(String num) {
		this.num = num;
	}

	public void setLesMeds(Collection<Med> lesMeds) {
		this.lesMeds = lesMeds;
	}
    
    
}
