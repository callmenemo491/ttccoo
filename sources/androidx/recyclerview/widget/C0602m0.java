package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.m0 */
/* loaded from: classes.dex */
public class C0602m0 {

    /* renamed from: a */
    public final p319s.C5941h<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0, androidx.recyclerview.widget.C0602m0.a> f3478a;

    /* renamed from: b */
    public final p319s.C5938e<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> f3479b;

    /* renamed from: androidx.recyclerview.widget.m0$a */
    public static class a {

        /* renamed from: d */
        public static p212m0.InterfaceC4313c<androidx.recyclerview.widget.C0602m0.a> f3480d;

        /* renamed from: a */
        public int f3481a;

        /* renamed from: b */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0554j.c f3482b;

        /* renamed from: c */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0554j.c f3483c;

        static {
                v.e r0 = new v.e
                r1 = 20
                r2 = 1
                r0.<init>(r1, r2)
                androidx.recyclerview.widget.C0602m0.a.f3480d = r0
                return
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public static androidx.recyclerview.widget.C0602m0.a m2094a() {
                m0.c<androidx.recyclerview.widget.m0$a> r0 = androidx.recyclerview.widget.C0602m0.a.f3480d
                v.e r0 = (p365v.C6478e) r0
                java.lang.Object r0 = r0.mo6231b()
                androidx.recyclerview.widget.m0$a r0 = (androidx.recyclerview.widget.C0602m0.a) r0
                if (r0 != 0) goto L11
                androidx.recyclerview.widget.m0$a r0 = new androidx.recyclerview.widget.m0$a
                r0.<init>()
            L11:
                return r0
        }

        /* renamed from: b */
        public static void m2095b(androidx.recyclerview.widget.C0602m0.a r1) {
                r0 = 0
                r1.f3481a = r0
                r0 = 0
                r1.f3482b = r0
                r1.f3483c = r0
                m0.c<androidx.recyclerview.widget.m0$a> r0 = androidx.recyclerview.widget.C0602m0.a.f3480d
                v.e r0 = (p365v.C6478e) r0
                r0.mo6230a(r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.m0$b */
    public interface b {
    }

    public C0602m0() {
            r1 = this;
            r1.<init>()
            s.h r0 = new s.h
            r0.<init>()
            r1.f3478a = r0
            s.e r0 = new s.e
            r0.<init>()
            r1.f3479b = r0
            return
    }

    /* renamed from: a */
    public void m2087a(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3) {
            r2 = this;
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r0 = r2.f3478a
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r3, r1)
            androidx.recyclerview.widget.m0$a r0 = (androidx.recyclerview.widget.C0602m0.a) r0
            if (r0 != 0) goto L14
            androidx.recyclerview.widget.m0$a r0 = androidx.recyclerview.widget.C0602m0.a.m2094a()
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r1 = r2.f3478a
            r1.put(r3, r0)
        L14:
            int r3 = r0.f3481a
            r3 = r3 | 1
            r0.f3481a = r3
            return
    }

    /* renamed from: b */
    public void m2088b(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3, androidx.recyclerview.widget.RecyclerView.AbstractC0554j.c r4) {
            r2 = this;
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r0 = r2.f3478a
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r3, r1)
            androidx.recyclerview.widget.m0$a r0 = (androidx.recyclerview.widget.C0602m0.a) r0
            if (r0 != 0) goto L14
            androidx.recyclerview.widget.m0$a r0 = androidx.recyclerview.widget.C0602m0.a.m2094a()
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r1 = r2.f3478a
            r1.put(r3, r0)
        L14:
            r0.f3483c = r4
            int r3 = r0.f3481a
            r3 = r3 | 8
            r0.f3481a = r3
            return
    }

    /* renamed from: c */
    public void m2089c(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3, androidx.recyclerview.widget.RecyclerView.AbstractC0554j.c r4) {
            r2 = this;
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r0 = r2.f3478a
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r3, r1)
            androidx.recyclerview.widget.m0$a r0 = (androidx.recyclerview.widget.C0602m0.a) r0
            if (r0 != 0) goto L14
            androidx.recyclerview.widget.m0$a r0 = androidx.recyclerview.widget.C0602m0.a.m2094a()
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r1 = r2.f3478a
            r1.put(r3, r0)
        L14:
            r0.f3482b = r4
            int r3 = r0.f3481a
            r3 = r3 | 4
            r0.f3481a = r3
            return
    }

    /* renamed from: d */
    public boolean m2090d(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3) {
            r2 = this;
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r0 = r2.f3478a
            r1 = 0
            java.lang.Object r3 = r0.getOrDefault(r3, r1)
            androidx.recyclerview.widget.m0$a r3 = (androidx.recyclerview.widget.C0602m0.a) r3
            r0 = 1
            if (r3 == 0) goto L12
            int r3 = r3.f3481a
            r3 = r3 & r0
            if (r3 == 0) goto L12
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    /* renamed from: e */
    public final androidx.recyclerview.widget.RecyclerView.AbstractC0554j.c m2091e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r5, int r6) {
            r4 = this;
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r0 = r4.f3478a
            int r5 = r0.m12340e(r5)
            r0 = 0
            if (r5 >= 0) goto La
            return r0
        La:
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r1 = r4.f3478a
            java.lang.Object r1 = r1.m12344l(r5)
            androidx.recyclerview.widget.m0$a r1 = (androidx.recyclerview.widget.C0602m0.a) r1
            if (r1 == 0) goto L3f
            int r2 = r1.f3481a
            r3 = r2 & r6
            if (r3 == 0) goto L3f
            int r0 = ~r6
            r0 = r0 & r2
            r1.f3481a = r0
            r2 = 4
            if (r6 != r2) goto L24
            androidx.recyclerview.widget.RecyclerView$j$c r6 = r1.f3482b
            goto L2a
        L24:
            r2 = 8
            if (r6 != r2) goto L37
            androidx.recyclerview.widget.RecyclerView$j$c r6 = r1.f3483c
        L2a:
            r0 = r0 & 12
            if (r0 != 0) goto L36
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r0 = r4.f3478a
            r0.mo5830j(r5)
            androidx.recyclerview.widget.C0602m0.a.m2095b(r1)
        L36:
            return r6
        L37:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Must provide flag PRE or POST"
            r5.<init>(r6)
            throw r5
        L3f:
            return r0
    }

    /* renamed from: f */
    public void m2092f(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3) {
            r2 = this;
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r0 = r2.f3478a
            r1 = 0
            java.lang.Object r3 = r0.getOrDefault(r3, r1)
            androidx.recyclerview.widget.m0$a r3 = (androidx.recyclerview.widget.C0602m0.a) r3
            if (r3 != 0) goto Lc
            return
        Lc:
            int r0 = r3.f3481a
            r0 = r0 & (-2)
            r3.f3481a = r0
            return
    }

    /* renamed from: g */
    public void m2093g(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r7) {
            r6 = this;
            s.e<androidx.recyclerview.widget.RecyclerView$b0> r0 = r6.f3479b
            int r0 = r0.m12327j()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L24
            s.e<androidx.recyclerview.widget.RecyclerView$b0> r2 = r6.f3479b
            java.lang.Object r2 = r2.m12328k(r0)
            if (r7 != r2) goto L21
            s.e<androidx.recyclerview.widget.RecyclerView$b0> r2 = r6.f3479b
            java.lang.Object[] r3 = r2.f22781a0
            r4 = r3[r0]
            java.lang.Object r5 = p319s.C5938e.f22778c0
            if (r4 == r5) goto L24
            r3[r0] = r5
            r2.f22779Y = r1
            goto L24
        L21:
            int r0 = r0 + (-1)
            goto L8
        L24:
            s.h<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.m0$a> r0 = r6.f3478a
            java.lang.Object r7 = r0.remove(r7)
            androidx.recyclerview.widget.m0$a r7 = (androidx.recyclerview.widget.C0602m0.a) r7
            if (r7 == 0) goto L31
            androidx.recyclerview.widget.C0602m0.a.m2095b(r7)
        L31:
            return
    }
}
