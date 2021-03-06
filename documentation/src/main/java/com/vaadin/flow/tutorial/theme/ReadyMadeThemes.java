package com.vaadin.flow.tutorial.theme;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.theme.NoTheme;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.flow.tutorial.annotations.CodeFor;

@CodeFor("theme/using-component-themes.asciidoc")
public class ReadyMadeThemes {
    @Route(value = "")
    @Theme(Lumo.class) // can be omitted for Lumo
    public class Application extends Div {
    }

    @Theme(MyTheme.class)
    public class MainLayout extends Div implements RouterLayout {
    }

    @Route(value = "", layout = MainLayout.class)
    public class HomeView extends Div {
    }

    @Route(value = "blog", layout = MainLayout.class)
    public class BlogPost extends Div {
    }

    @Route(value = "")
    @NoTheme
    public class UnThemedApplication extends Div {
    }

    public class MyTheme extends Lumo {
    }
}
