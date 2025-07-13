package p381w;

/* renamed from: w.n */
/* loaded from: classes.dex */
public class C6773n extends p381w.C6765f {

    /* renamed from: H0 */
    public java.util.ArrayList<p381w.C6765f> f26243H0;

    public C6773n() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f26243H0 = r0
            return
    }

    @Override // p381w.C6765f
    /* renamed from: E */
    public void mo13693E() {
            r1 = this;
            java.util.ArrayList<w.f> r0 = r1.f26243H0
            r0.clear()
            super.mo13693E()
            return
    }

    @Override // p381w.C6765f
    /* renamed from: G */
    public void mo13695G(p365v.C6476c r4) {
            r3 = this;
            super.mo13695G(r4)
            java.util.ArrayList<w.f> r0 = r3.f26243H0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<w.f> r2 = r3.f26243H0
            java.lang.Object r2 = r2.get(r1)
            w.f r2 = (p381w.C6765f) r2
            r2.mo13695G(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    /* renamed from: S */
    public void mo13728S() {
            r4 = this;
            java.util.ArrayList<w.f> r0 = r4.f26243H0
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L20
            java.util.ArrayList<w.f> r2 = r4.f26243H0
            java.lang.Object r2 = r2.get(r1)
            w.f r2 = (p381w.C6765f) r2
            boolean r3 = r2 instanceof p381w.C6773n
            if (r3 == 0) goto L1d
            w.n r2 = (p381w.C6773n) r2
            r2.mo13728S()
        L1d:
            int r1 = r1 + 1
            goto La
        L20:
            return
    }
}
