package com.example.sponsotask;

import  androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class TabsAccessorAdapter extends FragmentPagerAdapter {


    public TabsAccessorAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {

        switch (i){


            case 0:
                E_BooksFragment e_booksFragment= new E_BooksFragment();
                return e_booksFragment;
                case 1:
                Class_NotesFragment class_notesFragment= new Class_NotesFragment();
                return class_notesFragment;
            case 2:
                PreviousFragment previousFragment=new PreviousFragment();
                return previousFragment;


                default:
                    return null;


        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){

            case 0:
                return "e-Books";

            case 1:
                return "class Notes";

            case 2:
                return "Previous Year Notes";

            default:
                return null;


        }


    }
}
