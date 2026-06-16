package com.daaw;

import com.daaw.tf1;

/* JADX INFO: loaded from: classes.dex */
public class bm5 implements ag2 {
    public static final String[] e = {"composition:0"};
    public static String f = "Texture";
    public String b = "u_texture";
    public boolean c = false;
    public int d = 0;
    public final tf1 a = new tf1(new tf1.b() { // from class: com.daaw.am5
        @Override // com.daaw.tf1.b
        public final void a() {
            this.a.j();
        }
    }, null, null, null);

    public bm5() {
        s("composition:1");
    }

    @Override // com.daaw.oe2
    public void a(wt0 wt0Var) {
        this.b = wt0Var.x("name", this.b);
        s(wt0Var.x("TargetImage", "composition:1"));
    }

    public String c() {
        return this.a.j();
    }

    public void j() {
        this.c = false;
        this.d = 0;
        tf1 tf1Var = this.a;
        if (tf1Var != null) {
            tf1Var.p();
        }
    }

    @Override // com.daaw.ag2
    public String n() {
        return this.b;
    }

    @Override // com.daaw.ag2
    public Object o() {
        return this.a;
    }

    @Override // com.daaw.oe2
    public void q(wt0 wt0Var) {
        wt0Var.k0("name", this.b, "misc");
        wt0Var.h0("TargetImage", c(), "misc", e);
    }

    public void s(String str) {
        this.a.C(str);
    }
}
