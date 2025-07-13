package androidx.fragment.app;

/* renamed from: androidx.fragment.app.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC0394m0 {

    /* renamed from: a */
    public java.util.ArrayList<androidx.fragment.app.AbstractC0394m0.a> f2233a;

    /* renamed from: b */
    public int f2234b;

    /* renamed from: c */
    public int f2235c;

    /* renamed from: d */
    public int f2236d;

    /* renamed from: e */
    public int f2237e;

    /* renamed from: f */
    public int f2238f;

    /* renamed from: g */
    public boolean f2239g;

    /* renamed from: h */
    public boolean f2240h;

    /* renamed from: i */
    public java.lang.String f2241i;

    /* renamed from: j */
    public int f2242j;

    /* renamed from: k */
    public java.lang.CharSequence f2243k;

    /* renamed from: l */
    public int f2244l;

    /* renamed from: m */
    public java.lang.CharSequence f2245m;

    /* renamed from: n */
    public java.util.ArrayList<java.lang.String> f2246n;

    /* renamed from: o */
    public java.util.ArrayList<java.lang.String> f2247o;

    /* renamed from: p */
    public boolean f2248p;

    /* renamed from: androidx.fragment.app.m0$a */
    public static final class a {

        /* renamed from: a */
        public int f2249a;

        /* renamed from: b */
        public androidx.fragment.app.ComponentCallbacksC0395n f2250b;

        /* renamed from: c */
        public int f2251c;

        /* renamed from: d */
        public int f2252d;

        /* renamed from: e */
        public int f2253e;

        /* renamed from: f */
        public int f2254f;

        /* renamed from: g */
        public androidx.lifecycle.AbstractC0458o.c f2255g;

        /* renamed from: h */
        public androidx.lifecycle.AbstractC0458o.c f2256h;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public a(int r1, androidx.fragment.app.ComponentCallbacksC0395n r2) {
                r0 = this;
                r0.<init>()
                r0.f2249a = r1
                r0.f2250b = r2
                androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2550c0
                r0.f2255g = r1
                r0.f2256h = r1
                return
        }
    }

    public AbstractC0394m0(androidx.fragment.app.C0419z r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f2233a = r1
            r1 = 1
            r0.f2240h = r1
            r1 = 0
            r0.f2248p = r1
            return
    }

    /* renamed from: c */
    public void m1292c(androidx.fragment.app.AbstractC0394m0.a r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.m0$a> r0 = r1.f2233a
            r0.add(r2)
            int r0 = r1.f2234b
            r2.f2251c = r0
            int r0 = r1.f2235c
            r2.f2252d = r0
            int r0 = r1.f2236d
            r2.f2253e = r0
            int r0 = r1.f2237e
            r2.f2254f = r0
            return
    }

    /* renamed from: d */
    public androidx.fragment.app.AbstractC0394m0 m1293d(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.f2240h
            if (r0 == 0) goto La
            r0 = 1
            r1.f2239g = r0
            r1.f2241i = r2
            return r1
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This FragmentTransaction is not allowed to be added to the back stack."
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: e */
    public abstract int mo1075e();
}
