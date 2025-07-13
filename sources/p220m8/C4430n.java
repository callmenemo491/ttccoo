package p220m8;

/* renamed from: m8.n */
/* loaded from: classes.dex */
public class C4430n {

    /* renamed from: m8.n$a */
    public static class a implements p227n0.InterfaceC4653l {

        /* renamed from: a */
        public final /* synthetic */ p220m8.C4430n.b f18085a;

        /* renamed from: b */
        public final /* synthetic */ p220m8.C4430n.c f18086b;

        public a(p220m8.C4430n.b r1, p220m8.C4430n.c r2) {
                r0 = this;
                r0.f18085a = r1
                r0.f18086b = r2
                r0.<init>()
                return
        }

        @Override // p227n0.InterfaceC4653l
        /* renamed from: a */
        public p227n0.C4642a0 mo984a(android.view.View r4, p227n0.C4642a0 r5) {
                r3 = this;
                m8.n$b r0 = r3.f18085a
                m8.n$c r1 = new m8.n$c
                m8.n$c r2 = r3.f18086b
                r1.<init>(r2)
                n0.a0 r4 = r0.mo35a(r4, r5, r1)
                return r4
        }
    }

    /* renamed from: m8.n$b */
    public interface b {
        /* renamed from: a */
        p227n0.C4642a0 mo35a(android.view.View r1, p227n0.C4642a0 r2, p220m8.C4430n.c r3);
    }

    /* renamed from: m8.n$c */
    public static class c {

        /* renamed from: a */
        public int f18087a;

        /* renamed from: b */
        public int f18088b;

        /* renamed from: c */
        public int f18089c;

        /* renamed from: d */
        public int f18090d;

        public c(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f18087a = r1
                r0.f18088b = r2
                r0.f18089c = r3
                r0.f18090d = r4
                return
        }

        public c(p220m8.C4430n.c r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.f18087a
                r1.f18087a = r0
                int r0 = r2.f18088b
                r1.f18088b = r0
                int r0 = r2.f18089c
                r1.f18089c = r0
                int r2 = r2.f18090d
                r1.f18090d = r2
                return
        }
    }

    /* renamed from: a */
    public static void m9883a(android.view.View r5, p220m8.C4430n.b r6) {
            m8.n$c r0 = new m8.n$c
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.d.m10577f(r5)
            int r2 = r5.getPaddingTop()
            int r3 = p227n0.C4661t.d.m10576e(r5)
            int r4 = r5.getPaddingBottom()
            r0.<init>(r1, r2, r3, r4)
            m8.n$a r1 = new m8.n$a
            r1.<init>(r6, r0)
            p227n0.C4661t.h.m10616u(r5, r1)
            boolean r6 = p227n0.C4661t.f.m10587b(r5)
            if (r6 == 0) goto L29
            p227n0.C4661t.g.m10595c(r5)
            goto L31
        L29:
            m8.o r6 = new m8.o
            r6.<init>()
            r5.addOnAttachStateChangeListener(r6)
        L31:
            return
    }

    /* renamed from: b */
    public static float m9884b(android.content.Context r1, int r2) {
            android.content.res.Resources r1 = r1.getResources()
            float r2 = (float) r2
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            return r1
    }

    /* renamed from: c */
    public static float m9885c(android.view.View r3) {
            android.view.ViewParent r3 = r3.getParent()
            r0 = 0
        L5:
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L18
            r1 = r3
            android.view.View r1 = (android.view.View) r1
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            float r1 = p227n0.C4661t.h.m10604i(r1)
            float r0 = r0 + r1
            android.view.ViewParent r3 = r3.getParent()
            goto L5
        L18:
            return r0
    }

    /* renamed from: d */
    public static boolean m9886d(android.view.View r1) {
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.d.m10575d(r1)
            r0 = 1
            if (r1 != r0) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: e */
    public static android.graphics.PorterDuff.Mode m9887e(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }
}
