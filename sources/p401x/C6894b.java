package p401x;

/* renamed from: x.b */
/* loaded from: classes.dex */
public class C6894b {

    /* renamed from: a */
    public final java.util.ArrayList<p381w.C6765f> f26796a;

    /* renamed from: b */
    public p401x.C6894b.a f26797b;

    /* renamed from: c */
    public p381w.C6766g f26798c;

    /* renamed from: x.b$a */
    public static class a {

        /* renamed from: a */
        public p381w.C6765f.a f26799a;

        /* renamed from: b */
        public p381w.C6765f.a f26800b;

        /* renamed from: c */
        public int f26801c;

        /* renamed from: d */
        public int f26802d;

        /* renamed from: e */
        public int f26803e;

        /* renamed from: f */
        public int f26804f;

        /* renamed from: g */
        public int f26805g;

        /* renamed from: h */
        public boolean f26806h;

        /* renamed from: i */
        public boolean f26807i;

        /* renamed from: j */
        public int f26808j;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: x.b$b */
    public interface b {
    }

    public C6894b(p381w.C6766g r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f26796a = r0
            x.b$a r0 = new x.b$a
            r0.<init>()
            r1.f26797b = r0
            r1.f26798c = r2
            return
    }

    /* renamed from: a */
    public final boolean m13961a(p401x.C6894b.b r7, p381w.C6765f r8, int r9) {
            r6 = this;
            w.f$a r0 = p381w.C6765f.a.f26189Y
            x.b$a r1 = r6.f26797b
            w.f$a r2 = r8.m13716p()
            r1.f26799a = r2
            x.b$a r1 = r6.f26797b
            w.f$a r2 = r8.m13720t()
            r1.f26800b = r2
            x.b$a r1 = r6.f26797b
            int r2 = r8.m13721u()
            r1.f26801c = r2
            x.b$a r1 = r6.f26797b
            int r2 = r8.m13715o()
            r1.f26802d = r2
            x.b$a r1 = r6.f26797b
            r2 = 0
            r1.f26807i = r2
            r1.f26808j = r9
            w.f$a r9 = r1.f26799a
            w.f$a r3 = p381w.C6765f.a.f26191a0
            r4 = 1
            if (r9 != r3) goto L32
            r9 = 1
            goto L33
        L32:
            r9 = 0
        L33:
            w.f$a r5 = r1.f26800b
            if (r5 != r3) goto L39
            r3 = 1
            goto L3a
        L39:
            r3 = 0
        L3a:
            r5 = 0
            if (r9 == 0) goto L45
            float r9 = r8.f26131U
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 <= 0) goto L45
            r9 = 1
            goto L46
        L45:
            r9 = 0
        L46:
            if (r3 == 0) goto L50
            float r3 = r8.f26131U
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L50
            r3 = 1
            goto L51
        L50:
            r3 = 0
        L51:
            r5 = 4
            if (r9 == 0) goto L5c
            int[] r9 = r8.f26163n
            r9 = r9[r2]
            if (r9 != r5) goto L5c
            r1.f26799a = r0
        L5c:
            if (r3 == 0) goto L66
            int[] r9 = r8.f26163n
            r9 = r9[r4]
            if (r9 != r5) goto L66
            r1.f26800b = r0
        L66:
            androidx.constraintlayout.widget.ConstraintLayout$b r7 = (androidx.constraintlayout.widget.ConstraintLayout.C0331b) r7
            r7.m934b(r8, r1)
            x.b$a r7 = r6.f26797b
            int r7 = r7.f26803e
            r8.m13704P(r7)
            x.b$a r7 = r6.f26797b
            int r7 = r7.f26804f
            r8.m13699K(r7)
            x.b$a r7 = r6.f26797b
            boolean r9 = r7.f26806h
            r8.f26104A = r9
            int r7 = r7.f26805g
            r8.m13696H(r7)
            x.b$a r7 = r6.f26797b
            r7.f26808j = r2
            boolean r7 = r7.f26807i
            return r7
    }

    /* renamed from: b */
    public final void m13962b(p381w.C6766g r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.f26144d0
            int r1 = r4.f26146e0
            r2 = 0
            r4.m13702N(r2)
            r4.m13701M(r2)
            r4.f26129S = r5
            int r2 = r4.f26144d0
            if (r5 >= r2) goto L13
            r4.f26129S = r2
        L13:
            r4.f26130T = r6
            int r5 = r4.f26146e0
            if (r6 >= r5) goto L1b
            r4.f26130T = r5
        L1b:
            r4.m13702N(r0)
            r4.m13701M(r1)
            w.g r4 = r3.f26798c
            r4.mo13728S()
            return
    }

    /* renamed from: c */
    public void m13963c(p381w.C6766g r6) {
            r5 = this;
            java.util.ArrayList<w.f> r0 = r5.f26796a
            r0.clear()
            java.util.ArrayList<w.f> r0 = r6.f26243H0
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L2c
            java.util.ArrayList<w.f> r2 = r6.f26243H0
            java.lang.Object r2 = r2.get(r1)
            w.f r2 = (p381w.C6765f) r2
            w.f$a r3 = r2.m13716p()
            w.f$a r4 = p381w.C6765f.a.f26191a0
            if (r3 == r4) goto L24
            w.f$a r3 = r2.m13720t()
            if (r3 != r4) goto L29
        L24:
            java.util.ArrayList<w.f> r3 = r5.f26796a
            r3.add(r2)
        L29:
            int r1 = r1 + 1
            goto Lc
        L2c:
            r6.m13735Z()
            return
    }
}
