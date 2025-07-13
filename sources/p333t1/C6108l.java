package p333t1;

/* renamed from: t1.l */
/* loaded from: classes.dex */
public class C6108l {

    /* renamed from: a */
    public static p333t1.AbstractC6104h f23604a;

    /* renamed from: b */
    public static java.lang.ThreadLocal<java.lang.ref.WeakReference<p319s.C5934a<android.view.ViewGroup, java.util.ArrayList<p333t1.AbstractC6104h>>>> f23605b;

    /* renamed from: c */
    public static java.util.ArrayList<android.view.ViewGroup> f23606c;

    /* renamed from: t1.l$a */
    public static class a implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

        /* renamed from: Y */
        public p333t1.AbstractC6104h f23607Y;

        /* renamed from: Z */
        public android.view.ViewGroup f23608Z;

        /* renamed from: t1.l$a$a, reason: collision with other inner class name */
        public class C7423a extends p333t1.C6107k {

            /* renamed from: a */
            public final /* synthetic */ p319s.C5934a f23609a;

            /* renamed from: b */
            public final /* synthetic */ p333t1.C6108l.a f23610b;

            public C7423a(p333t1.C6108l.a r1, p319s.C5934a r2) {
                    r0 = this;
                    r0.f23610b = r1
                    r0.f23609a = r2
                    r0.<init>()
                    return
            }

            @Override // p333t1.AbstractC6104h.d
            /* renamed from: a */
            public void mo12591a(p333t1.AbstractC6104h r3) {
                    r2 = this;
                    s.a r0 = r2.f23609a
                    t1.l$a r1 = r2.f23610b
                    android.view.ViewGroup r1 = r1.f23608Z
                    java.lang.Object r0 = r0.get(r1)
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    r0.remove(r3)
                    r3.mo12630z(r2)
                    return
            }
        }

        public a(p333t1.AbstractC6104h r1, android.view.ViewGroup r2) {
                r0 = this;
                r0.<init>()
                r0.f23607Y = r1
                r0.f23608Z = r2
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r18 = this;
                r0 = r18
                android.view.ViewGroup r1 = r0.f23608Z
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f23608Z
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = p333t1.C6108l.f23606c
                android.view.ViewGroup r2 = r0.f23608Z
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L1c
                return r2
            L1c:
                s.a r1 = p333t1.C6108l.m12632b()
                android.view.ViewGroup r3 = r0.f23608Z
                java.lang.Object r3 = r1.get(r3)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r4 = 0
                if (r3 != 0) goto L36
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f23608Z
                r1.put(r5, r3)
                goto L42
            L36:
                int r5 = r3.size()
                if (r5 <= 0) goto L42
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L43
            L42:
                r5 = r4
            L43:
                t1.h r6 = r0.f23607Y
                r3.add(r6)
                t1.h r3 = r0.f23607Y
                t1.l$a$a r6 = new t1.l$a$a
                r6.<init>(r0, r1)
                r3.mo12616a(r6)
                t1.h r1 = r0.f23607Y
                android.view.ViewGroup r3 = r0.f23608Z
                r6 = 0
                r1.m12620j(r3, r6)
                if (r5 == 0) goto L72
                java.util.Iterator r1 = r5.iterator()
            L60:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L72
                java.lang.Object r3 = r1.next()
                t1.h r3 = (p333t1.AbstractC6104h) r3
                android.view.ViewGroup r5 = r0.f23608Z
                r3.mo12606B(r5)
                goto L60
            L72:
                t1.h r1 = r0.f23607Y
                android.view.ViewGroup r8 = r0.f23608Z
                java.util.Objects.requireNonNull(r1)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f23586i0 = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f23587j0 = r3
                v.c r3 = r1.f23582e0
                v.c r5 = r1.f23583f0
                s.a r7 = new s.a
                v.e r9 = r3.f25075Y
                s.a r9 = (p319s.C5934a) r9
                r7.<init>(r9)
                s.a r9 = new s.a
                v.e r10 = r5.f25075Y
                s.a r10 = (p319s.C5934a) r10
                r9.<init>(r10)
                r10 = 0
            L9e:
                int[] r11 = r1.f23585h0
                int r12 = r11.length
                if (r10 >= r12) goto L204
                r11 = r11[r10]
                if (r11 == r2) goto L1c4
                r12 = 2
                if (r11 == r12) goto L172
                r12 = 3
                if (r11 == r12) goto L11a
                r12 = 4
                if (r11 == r12) goto Lb3
            Lb0:
                r17 = r3
                goto L116
            Lb3:
                v.e r11 = r3.f25077a0
                s.e r11 = (p319s.C5938e) r11
                v.e r12 = r5.f25077a0
                s.e r12 = (p319s.C5938e) r12
                int r13 = r11.m12327j()
                r14 = 0
            Lc0:
                if (r14 >= r13) goto Lb0
                java.lang.Object r15 = r11.m12328k(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L10c
                boolean r16 = r1.m12628w(r15)
                if (r16 == 0) goto L10c
                boolean r6 = r11.f22779Y
                if (r6 == 0) goto Ld7
                r11.m12323d()
            Ld7:
                long[] r6 = r11.f22780Z
                r17 = r3
                r2 = r6[r14]
                java.lang.Object r2 = r12.m12324e(r2)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L10e
                boolean r3 = r1.m12628w(r2)
                if (r3 == 0) goto L10e
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                t1.o r3 = (p333t1.C6111o) r3
                java.lang.Object r6 = r9.getOrDefault(r2, r4)
                t1.o r6 = (p333t1.C6111o) r6
                if (r3 == 0) goto L10e
                if (r6 == 0) goto L10e
                java.util.ArrayList<t1.o> r4 = r1.f23586i0
                r4.add(r3)
                java.util.ArrayList<t1.o> r3 = r1.f23587j0
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L10e
            L10c:
                r17 = r3
            L10e:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto Lc0
            L116:
                r2 = r17
                goto L1fa
            L11a:
                r2 = r3
                v.e r3 = r2.f25076Z
                android.util.SparseArray r3 = (android.util.SparseArray) r3
                v.e r4 = r5.f25076Z
                android.util.SparseArray r4 = (android.util.SparseArray) r4
                int r6 = r3.size()
                r11 = 0
            L128:
                if (r11 >= r6) goto L1fa
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L16d
                boolean r13 = r1.m12628w(r12)
                if (r13 == 0) goto L16d
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L16d
                boolean r14 = r1.m12628w(r13)
                if (r14 == 0) goto L16d
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                t1.o r15 = (p333t1.C6111o) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                t1.o r14 = (p333t1.C6111o) r14
                if (r15 == 0) goto L16d
                if (r14 == 0) goto L16d
                java.util.ArrayList<t1.o> r0 = r1.f23586i0
                r0.add(r15)
                java.util.ArrayList<t1.o> r0 = r1.f23587j0
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L16d:
                int r11 = r11 + 1
                r0 = r18
                goto L128
            L172:
                r2 = r3
                java.lang.Object r0 = r2.f25078b0
                s.a r0 = (p319s.C5934a) r0
                java.lang.Object r3 = r5.f25078b0
                s.a r3 = (p319s.C5934a) r3
                int r4 = r0.f22812a0
                r6 = 0
            L17e:
                if (r6 >= r4) goto L1fa
                java.lang.Object r11 = r0.m12344l(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L1c1
                boolean r12 = r1.m12628w(r11)
                if (r12 == 0) goto L1c1
                java.lang.Object r12 = r0.m12343h(r6)
                java.lang.Object r12 = r3.get(r12)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L1c1
                boolean r13 = r1.m12628w(r12)
                if (r13 == 0) goto L1c1
                r13 = 0
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                t1.o r14 = (p333t1.C6111o) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                t1.o r15 = (p333t1.C6111o) r15
                if (r14 == 0) goto L1c1
                if (r15 == 0) goto L1c1
                java.util.ArrayList<t1.o> r13 = r1.f23586i0
                r13.add(r14)
                java.util.ArrayList<t1.o> r13 = r1.f23587j0
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L1c1:
                int r6 = r6 + 1
                goto L17e
            L1c4:
                r2 = r3
                int r0 = r7.f22812a0
            L1c7:
                int r0 = r0 + (-1)
                if (r0 < 0) goto L1fa
                java.lang.Object r3 = r7.m12343h(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L1c7
                boolean r4 = r1.m12628w(r3)
                if (r4 == 0) goto L1c7
                java.lang.Object r3 = r9.remove(r3)
                t1.o r3 = (p333t1.C6111o) r3
                if (r3 == 0) goto L1c7
                android.view.View r4 = r3.f23622b
                boolean r4 = r1.m12628w(r4)
                if (r4 == 0) goto L1c7
                java.lang.Object r4 = r7.mo5830j(r0)
                t1.o r4 = (p333t1.C6111o) r4
                java.util.ArrayList<t1.o> r6 = r1.f23586i0
                r6.add(r4)
                java.util.ArrayList<t1.o> r4 = r1.f23587j0
                r4.add(r3)
                goto L1c7
            L1fa:
                int r10 = r10 + 1
                r0 = r18
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L9e
            L204:
                r0 = 0
            L205:
                int r2 = r7.f22812a0
                if (r0 >= r2) goto L225
                java.lang.Object r2 = r7.m12344l(r0)
                t1.o r2 = (p333t1.C6111o) r2
                android.view.View r3 = r2.f23622b
                boolean r3 = r1.m12628w(r3)
                if (r3 == 0) goto L222
                java.util.ArrayList<t1.o> r3 = r1.f23586i0
                r3.add(r2)
                java.util.ArrayList<t1.o> r2 = r1.f23587j0
                r3 = 0
                r2.add(r3)
            L222:
                int r0 = r0 + 1
                goto L205
            L225:
                r0 = 0
            L226:
                int r2 = r9.f22812a0
                if (r0 >= r2) goto L246
                java.lang.Object r2 = r9.m12344l(r0)
                t1.o r2 = (p333t1.C6111o) r2
                android.view.View r3 = r2.f23622b
                boolean r3 = r1.m12628w(r3)
                if (r3 == 0) goto L243
                java.util.ArrayList<t1.o> r3 = r1.f23587j0
                r3.add(r2)
                java.util.ArrayList<t1.o> r2 = r1.f23586i0
                r3 = 0
                r2.add(r3)
            L243:
                int r0 = r0 + 1
                goto L226
            L246:
                s.a r0 = p333t1.AbstractC6104h.m12603s()
                int r2 = r0.f22812a0
                t1.w r3 = p333t1.C6113q.f23625a
                android.view.WindowId r3 = r8.getWindowId()
                r4 = 1
                int r2 = r2 - r4
            L254:
                if (r2 < 0) goto L2c6
                java.lang.Object r4 = r0.m12343h(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                r5 = 0
                if (r4 == 0) goto L2c3
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                t1.h$b r6 = (p333t1.AbstractC6104h.b) r6
                if (r6 == 0) goto L2c3
                android.view.View r7 = r6.f23596a
                if (r7 == 0) goto L2c3
                t1.a0 r7 = r6.f23599d
                boolean r9 = r7 instanceof p333t1.C6122z
                if (r9 == 0) goto L27d
                t1.z r7 = (p333t1.C6122z) r7
                android.view.WindowId r7 = r7.f23654a
                boolean r7 = r7.equals(r3)
                if (r7 == 0) goto L27d
                r7 = 1
                goto L27e
            L27d:
                r7 = 0
            L27e:
                if (r7 == 0) goto L2c3
                t1.o r7 = r6.f23598c
                android.view.View r9 = r6.f23596a
                r10 = 1
                t1.o r11 = r1.m12626u(r9, r10)
                t1.o r12 = r1.m12625r(r9, r10)
                if (r11 != 0) goto L29e
                if (r12 != 0) goto L29e
                v.c r10 = r1.f23583f0
                v.e r10 = r10.f25075Y
                s.a r10 = (p319s.C5934a) r10
                java.lang.Object r9 = r10.get(r9)
                r12 = r9
                t1.o r12 = (p333t1.C6111o) r12
            L29e:
                if (r11 != 0) goto L2a2
                if (r12 == 0) goto L2ac
            L2a2:
                t1.h r6 = r6.f23600e
                boolean r6 = r6.mo12627v(r7, r12)
                if (r6 == 0) goto L2ac
                r6 = 1
                goto L2ad
            L2ac:
                r6 = 0
            L2ad:
                if (r6 == 0) goto L2c3
                boolean r6 = r4.isRunning()
                if (r6 != 0) goto L2c0
                boolean r6 = r4.isStarted()
                if (r6 == 0) goto L2bc
                goto L2c0
            L2bc:
                r0.remove(r4)
                goto L2c3
            L2c0:
                r4.cancel()
            L2c3:
                int r2 = r2 + (-1)
                goto L254
            L2c6:
                v.c r9 = r1.f23582e0
                v.c r10 = r1.f23583f0
                java.util.ArrayList<t1.o> r11 = r1.f23586i0
                java.util.ArrayList<t1.o> r12 = r1.f23587j0
                r7 = r1
                r7.mo12623p(r8, r9, r10, r11, r12)
                r1.mo12607C()
                r0 = 1
                return r0
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup r3 = r2.f23608Z
                android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
                r3.removeOnPreDrawListener(r2)
                android.view.ViewGroup r3 = r2.f23608Z
                r3.removeOnAttachStateChangeListener(r2)
                java.util.ArrayList<android.view.ViewGroup> r3 = p333t1.C6108l.f23606c
                android.view.ViewGroup r0 = r2.f23608Z
                r3.remove(r0)
                s.a r3 = p333t1.C6108l.m12632b()
                android.view.ViewGroup r0 = r2.f23608Z
                java.lang.Object r3 = r3.get(r0)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 == 0) goto L3f
                int r0 = r3.size()
                if (r0 <= 0) goto L3f
                java.util.Iterator r3 = r3.iterator()
            L2d:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L3f
                java.lang.Object r0 = r3.next()
                t1.h r0 = (p333t1.AbstractC6104h) r0
                android.view.ViewGroup r1 = r2.f23608Z
                r0.mo12606B(r1)
                goto L2d
            L3f:
                t1.h r3 = r2.f23607Y
                r0 = 1
                r3.m12621k(r0)
                return
        }
    }

    static {
            t1.a r0 = new t1.a
            r0.<init>()
            p333t1.C6108l.f23604a = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p333t1.C6108l.f23605b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p333t1.C6108l.f23606c = r0
            return
    }

    /* renamed from: a */
    public static void m12631a(android.view.ViewGroup r3, p333t1.AbstractC6104h r4) {
            java.util.ArrayList<android.view.ViewGroup> r0 = p333t1.C6108l.f23606c
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L6b
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10588c(r3)
            if (r0 == 0) goto L6b
            java.util.ArrayList<android.view.ViewGroup> r0 = p333t1.C6108l.f23606c
            r0.add(r3)
            if (r4 != 0) goto L19
            t1.h r4 = p333t1.C6108l.f23604a
        L19:
            t1.h r4 = r4.mo12622m()
            s.a r0 = m12632b()
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r3, r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L44
            int r2 = r0.size()
            if (r2 <= 0) goto L44
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r0.next()
            t1.h r2 = (p333t1.AbstractC6104h) r2
            r2.mo12629y(r3)
            goto L34
        L44:
            if (r4 == 0) goto L4a
            r0 = 1
            r4.m12620j(r3, r0)
        L4a:
            r0 = 2131362735(0x7f0a03af, float:1.8345259E38)
            java.lang.Object r2 = r3.getTag(r0)
            t1.g r2 = (p333t1.C6103g) r2
            if (r2 != 0) goto L6a
            r3.setTag(r0, r1)
            if (r4 == 0) goto L6b
            t1.l$a r0 = new t1.l$a
            r0.<init>(r4, r3)
            r3.addOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            r3.addOnPreDrawListener(r0)
            goto L6b
        L6a:
            throw r1
        L6b:
            return
    }

    /* renamed from: b */
    public static p319s.C5934a<android.view.ViewGroup, java.util.ArrayList<p333t1.AbstractC6104h>> m12632b() {
            java.lang.ThreadLocal<java.lang.ref.WeakReference<s.a<android.view.ViewGroup, java.util.ArrayList<t1.h>>>> r0 = p333t1.C6108l.f23605b
            java.lang.Object r0 = r0.get()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.get()
            s.a r0 = (p319s.C5934a) r0
            if (r0 == 0) goto L13
            return r0
        L13:
            s.a r0 = new s.a
            r0.<init>()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            java.lang.ThreadLocal<java.lang.ref.WeakReference<s.a<android.view.ViewGroup, java.util.ArrayList<t1.h>>>> r2 = p333t1.C6108l.f23605b
            r2.set(r1)
            return r0
    }
}
