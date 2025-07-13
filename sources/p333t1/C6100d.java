package p333t1;

@android.annotation.SuppressLint({"RestrictedApi"})
/* renamed from: t1.d */
/* loaded from: classes.dex */
public class C6100d extends androidx.fragment.app.AbstractC0412v0 {

    /* renamed from: t1.d$a */
    public class a extends p333t1.AbstractC6104h.c {
        public a(p333t1.C6100d r1, android.graphics.Rect r2) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: t1.d$b */
    public class b implements p333t1.AbstractC6104h.d {

        /* renamed from: a */
        public final /* synthetic */ android.view.View f23562a;

        /* renamed from: b */
        public final /* synthetic */ java.util.ArrayList f23563b;

        public b(p333t1.C6100d r1, android.view.View r2, java.util.ArrayList r3) {
                r0 = this;
                r0.f23562a = r2
                r0.f23563b = r3
                r0.<init>()
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: a */
        public void mo12591a(p333t1.AbstractC6104h r4) {
                r3 = this;
                r4.mo12630z(r3)
                android.view.View r4 = r3.f23562a
                r0 = 8
                r4.setVisibility(r0)
                java.util.ArrayList r4 = r3.f23563b
                int r4 = r4.size()
                r0 = 0
                r1 = 0
            L12:
                if (r1 >= r4) goto L22
                java.util.ArrayList r2 = r3.f23563b
                java.lang.Object r2 = r2.get(r1)
                android.view.View r2 = (android.view.View) r2
                r2.setVisibility(r0)
                int r1 = r1 + 1
                goto L12
            L22:
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: b */
        public void mo12598b(p333t1.AbstractC6104h r1) {
                r0 = this;
                r1.mo12630z(r0)
                r1.mo12616a(r0)
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: c */
        public void mo12592c(p333t1.AbstractC6104h r1) {
                r0 = this;
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: d */
        public void mo12593d(p333t1.AbstractC6104h r1) {
                r0 = this;
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: e */
        public void mo12594e(p333t1.AbstractC6104h r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: t1.d$c */
    public class c extends p333t1.C6107k {

        /* renamed from: a */
        public final /* synthetic */ java.lang.Object f23564a;

        /* renamed from: b */
        public final /* synthetic */ java.util.ArrayList f23565b;

        /* renamed from: c */
        public final /* synthetic */ java.lang.Object f23566c;

        /* renamed from: d */
        public final /* synthetic */ java.util.ArrayList f23567d;

        /* renamed from: e */
        public final /* synthetic */ java.lang.Object f23568e;

        /* renamed from: f */
        public final /* synthetic */ java.util.ArrayList f23569f;

        /* renamed from: g */
        public final /* synthetic */ p333t1.C6100d f23570g;

        public c(p333t1.C6100d r1, java.lang.Object r2, java.util.ArrayList r3, java.lang.Object r4, java.util.ArrayList r5, java.lang.Object r6, java.util.ArrayList r7) {
                r0 = this;
                r0.f23570g = r1
                r0.f23564a = r2
                r0.f23565b = r3
                r0.f23566c = r4
                r0.f23567d = r5
                r0.f23568e = r6
                r0.f23569f = r7
                r0.<init>()
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: a */
        public void mo12591a(p333t1.AbstractC6104h r1) {
                r0 = this;
                r1.mo12630z(r0)
                return
        }

        @Override // p333t1.C6107k, p333t1.AbstractC6104h.d
        /* renamed from: b */
        public void mo12598b(p333t1.AbstractC6104h r4) {
                r3 = this;
                java.lang.Object r4 = r3.f23564a
                r0 = 0
                if (r4 == 0) goto Lc
                t1.d r1 = r3.f23570g
                java.util.ArrayList r2 = r3.f23565b
                r1.mo1381p(r4, r2, r0)
            Lc:
                java.lang.Object r4 = r3.f23566c
                if (r4 == 0) goto L17
                t1.d r1 = r3.f23570g
                java.util.ArrayList r2 = r3.f23567d
                r1.mo1381p(r4, r2, r0)
            L17:
                java.lang.Object r4 = r3.f23568e
                if (r4 == 0) goto L22
                t1.d r1 = r3.f23570g
                java.util.ArrayList r2 = r3.f23569f
                r1.mo1381p(r4, r2, r0)
            L22:
                return
        }
    }

    /* renamed from: t1.d$d */
    public class d implements p158j0.C3380b.a {

        /* renamed from: a */
        public final /* synthetic */ p333t1.AbstractC6104h f23571a;

        public d(p333t1.C6100d r1, p333t1.AbstractC6104h r2) {
                r0 = this;
                r0.f23571a = r2
                r0.<init>()
                return
        }

        @Override // p158j0.C3380b.a
        /* renamed from: a */
        public void mo1106a() {
                r1 = this;
                t1.h r0 = r1.f23571a
                r0.cancel()
                return
        }
    }

    /* renamed from: t1.d$e */
    public class e implements p333t1.AbstractC6104h.d {

        /* renamed from: a */
        public final /* synthetic */ java.lang.Runnable f23572a;

        public e(p333t1.C6100d r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f23572a = r2
                r0.<init>()
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: a */
        public void mo12591a(p333t1.AbstractC6104h r1) {
                r0 = this;
                java.lang.Runnable r1 = r0.f23572a
                r1.run()
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: b */
        public void mo12598b(p333t1.AbstractC6104h r1) {
                r0 = this;
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: c */
        public void mo12592c(p333t1.AbstractC6104h r1) {
                r0 = this;
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: d */
        public void mo12593d(p333t1.AbstractC6104h r1) {
                r0 = this;
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: e */
        public void mo12594e(p333t1.AbstractC6104h r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: t1.d$f */
    public class f extends p333t1.AbstractC6104h.c {
        public f(p333t1.C6100d r1, android.graphics.Rect r2) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public C6100d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: z */
    public static boolean m12597z(p333t1.AbstractC6104h r1) {
            java.util.ArrayList<java.lang.Integer> r1 = r1.f23580c0
            boolean r1 = androidx.fragment.app.AbstractC0412v0.m1392k(r1)
            if (r1 == 0) goto L18
            r1 = 0
            boolean r0 = androidx.fragment.app.AbstractC0412v0.m1392k(r1)
            if (r0 == 0) goto L18
            boolean r1 = androidx.fragment.app.AbstractC0412v0.m1392k(r1)
            if (r1 != 0) goto L16
            goto L18
        L16:
            r1 = 0
            goto L19
        L18:
            r1 = 1
        L19:
            return r1
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: a */
    public void mo1373a(java.lang.Object r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            t1.h r1 = (p333t1.AbstractC6104h) r1
            r1.mo12617b(r2)
        L7:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: b */
    public void mo1374b(java.lang.Object r4, java.util.ArrayList<android.view.View> r5) {
            r3 = this;
            t1.h r4 = (p333t1.AbstractC6104h) r4
            if (r4 != 0) goto L5
            return
        L5:
            boolean r0 = r4 instanceof p333t1.C6109m
            r1 = 0
            if (r0 == 0) goto L1e
            t1.m r4 = (p333t1.C6109m) r4
            java.util.ArrayList<t1.h> r0 = r4.f23611v0
            int r0 = r0.size()
        L12:
            if (r1 >= r0) goto L3e
            t1.h r2 = r4.m12634N(r1)
            r3.mo1374b(r2, r5)
            int r1 = r1 + 1
            goto L12
        L1e:
            boolean r0 = m12597z(r4)
            if (r0 != 0) goto L3e
            java.util.ArrayList<android.view.View> r0 = r4.f23581d0
            boolean r0 = androidx.fragment.app.AbstractC0412v0.m1392k(r0)
            if (r0 == 0) goto L3e
            int r0 = r5.size()
        L30:
            if (r1 >= r0) goto L3e
            java.lang.Object r2 = r5.get(r1)
            android.view.View r2 = (android.view.View) r2
            r4.mo12617b(r2)
            int r1 = r1 + 1
            goto L30
        L3e:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: c */
    public void mo1375c(android.view.ViewGroup r1, java.lang.Object r2) {
            r0 = this;
            t1.h r2 = (p333t1.AbstractC6104h) r2
            p333t1.C6108l.m12631a(r1, r2)
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: e */
    public boolean mo1376e(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof p333t1.AbstractC6104h
            return r1
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: g */
    public java.lang.Object mo1377g(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L9
            t1.h r1 = (p333t1.AbstractC6104h) r1
            t1.h r1 = r1.mo12622m()
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: l */
    public java.lang.Object mo1378l(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            t1.h r2 = (p333t1.AbstractC6104h) r2
            t1.h r3 = (p333t1.AbstractC6104h) r3
            t1.h r4 = (p333t1.AbstractC6104h) r4
            if (r2 == 0) goto L1b
            if (r3 == 0) goto L1b
            t1.m r0 = new t1.m
            r0.<init>()
            r0.m12633M(r2)
            r0.m12633M(r3)
            r2 = 1
            r0.m12637R(r2)
            r2 = r0
            goto L23
        L1b:
            if (r2 == 0) goto L1e
            goto L23
        L1e:
            if (r3 == 0) goto L22
            r2 = r3
            goto L23
        L22:
            r2 = 0
        L23:
            if (r4 == 0) goto L33
            t1.m r3 = new t1.m
            r3.<init>()
            if (r2 == 0) goto L2f
            r3.m12633M(r2)
        L2f:
            r3.m12633M(r4)
            return r3
        L33:
            return r2
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: m */
    public java.lang.Object mo1379m(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            t1.m r0 = new t1.m
            r0.<init>()
            if (r2 == 0) goto Lc
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r0.m12633M(r2)
        Lc:
            if (r3 == 0) goto L13
            t1.h r3 = (p333t1.AbstractC6104h) r3
            r0.m12633M(r3)
        L13:
            if (r4 == 0) goto L1a
            t1.h r4 = (p333t1.AbstractC6104h) r4
            r0.m12633M(r4)
        L1a:
            return r0
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: o */
    public void mo1380o(java.lang.Object r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            t1.h r1 = (p333t1.AbstractC6104h) r1
            r1.mo12605A(r2)
        L7:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: p */
    public void mo1381p(java.lang.Object r5, java.util.ArrayList<android.view.View> r6, java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            t1.h r5 = (p333t1.AbstractC6104h) r5
            boolean r0 = r5 instanceof p333t1.C6109m
            r1 = 0
            if (r0 == 0) goto L1b
            t1.m r5 = (p333t1.C6109m) r5
            java.util.ArrayList<t1.h> r0 = r5.f23611v0
            int r0 = r0.size()
        Lf:
            if (r1 >= r0) goto L5b
            t1.h r2 = r5.m12634N(r1)
            r4.mo1381p(r2, r6, r7)
            int r1 = r1 + 1
            goto Lf
        L1b:
            boolean r0 = m12597z(r5)
            if (r0 != 0) goto L5b
            java.util.ArrayList<android.view.View> r0 = r5.f23581d0
            int r2 = r0.size()
            int r3 = r6.size()
            if (r2 != r3) goto L5b
            boolean r0 = r0.containsAll(r6)
            if (r0 == 0) goto L5b
            if (r7 != 0) goto L37
            r0 = 0
            goto L3b
        L37:
            int r0 = r7.size()
        L3b:
            if (r1 >= r0) goto L49
            java.lang.Object r2 = r7.get(r1)
            android.view.View r2 = (android.view.View) r2
            r5.mo12617b(r2)
            int r1 = r1 + 1
            goto L3b
        L49:
            int r7 = r6.size()
        L4d:
            int r7 = r7 + (-1)
            if (r7 < 0) goto L5b
            java.lang.Object r0 = r6.get(r7)
            android.view.View r0 = (android.view.View) r0
            r5.mo12605A(r0)
            goto L4d
        L5b:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: q */
    public void mo1382q(java.lang.Object r2, android.view.View r3, java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            t1.h r2 = (p333t1.AbstractC6104h) r2
            t1.d$b r0 = new t1.d$b
            r0.<init>(r1, r3, r4)
            r2.mo12616a(r0)
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: r */
    public void mo1383r(java.lang.Object r11, java.lang.Object r12, java.util.ArrayList<android.view.View> r13, java.lang.Object r14, java.util.ArrayList<android.view.View> r15, java.lang.Object r16, java.util.ArrayList<android.view.View> r17) {
            r10 = this;
            r0 = r11
            t1.h r0 = (p333t1.AbstractC6104h) r0
            t1.d$c r9 = new t1.d$c
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.mo12616a(r9)
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: s */
    public void mo1384s(java.lang.Object r2, android.graphics.Rect r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            t1.h r2 = (p333t1.AbstractC6104h) r2
            t1.d$f r0 = new t1.d$f
            r0.<init>(r1, r3)
            r2.mo12609E(r0)
        Lc:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: t */
    public void mo1385t(java.lang.Object r2, android.view.View r3) {
            r1 = this;
            if (r3 == 0) goto L14
            t1.h r2 = (p333t1.AbstractC6104h) r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.m1395j(r3, r0)
            t1.d$a r3 = new t1.d$a
            r3.<init>(r1, r0)
            r2.mo12609E(r3)
        L14:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: u */
    public void mo1386u(androidx.fragment.app.ComponentCallbacksC0395n r1, java.lang.Object r2, p158j0.C3380b r3, java.lang.Runnable r4) {
            r0 = this;
            t1.h r2 = (p333t1.AbstractC6104h) r2
            t1.d$d r1 = new t1.d$d
            r1.<init>(r0, r2)
            r3.m7756b(r1)
            t1.d$e r1 = new t1.d$e
            r1.<init>(r0, r4)
            r2.mo12616a(r1)
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: w */
    public void mo1387w(java.lang.Object r5, android.view.View r6, java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            t1.m r5 = (p333t1.C6109m) r5
            java.util.ArrayList<android.view.View> r0 = r5.f23581d0
            r0.clear()
            int r1 = r7.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1a
            java.lang.Object r3 = r7.get(r2)
            android.view.View r3 = (android.view.View) r3
            androidx.fragment.app.AbstractC0412v0.m1390d(r0, r3)
            int r2 = r2 + 1
            goto Lc
        L1a:
            r0.add(r6)
            r7.add(r6)
            r4.mo1374b(r5, r7)
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: x */
    public void mo1388x(java.lang.Object r2, java.util.ArrayList<android.view.View> r3, java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            t1.m r2 = (p333t1.C6109m) r2
            if (r2 == 0) goto L11
            java.util.ArrayList<android.view.View> r0 = r2.f23581d0
            r0.clear()
            java.util.ArrayList<android.view.View> r0 = r2.f23581d0
            r0.addAll(r4)
            r1.mo1381p(r2, r3, r4)
        L11:
            return
    }

    @Override // androidx.fragment.app.AbstractC0412v0
    /* renamed from: y */
    public java.lang.Object mo1389y(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            t1.m r0 = new t1.m
            r0.<init>()
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r0.m12633M(r2)
            return r0
    }
}
