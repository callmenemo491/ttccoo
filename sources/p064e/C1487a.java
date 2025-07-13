package p064e;

/* renamed from: e.a */
/* loaded from: classes.dex */
public class C1487a {

    /* renamed from: e.a$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p032c2.InterfaceC0854b f7254Z;

        public a(p032c2.InterfaceC0854b r1) {
                r0 = this;
                r0.f7254Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r4) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                java.lang.String r0 = "$receiver"
                p214m2.C4339q.m9707l(r4, r0)
                c2.b r4 = r3.f7254Z
                c2.a r4 = (p032c2.C0853a) r4
                b2.a<?> r0 = r4.f4619c
                r0.mo2203d(r4)
                d2.c r0 = r4.f4618b
                java.util.Objects.requireNonNull(r0)
                java.lang.String r1 = "handle"
                p214m2.C4339q.m9707l(r4, r1)
                b2.a<?> r1 = r4.f4619c
                boolean r2 = r1 instanceof p019b2.InterfaceC0655a
                if (r2 != 0) goto L21
                r1 = 0
            L21:
                if (r1 == 0) goto L2a
                r0.f6742e = r1
                r0.f6741d = r4
                ch.l r4 = ch.C0985l.f5061a
                return r4
            L2a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                b2.a<?> r4 = r4.f4619c
                r0.append(r4)
                java.lang.String r4 = " is not a "
                r0.append(r4)
                java.lang.Class<b2.a> r4 = p019b2.InterfaceC0655a.class
                java.lang.String r4 = r4.getName()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    /* renamed from: e.a$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p032c2.InterfaceC0854b f7255Z;

        public b(p032c2.InterfaceC0854b r1) {
                r0 = this;
                r0.f7255Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r2) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.lang.String r0 = "$receiver"
                p214m2.C4339q.m9707l(r2, r0)
                c2.b r2 = r1.f7255Z
                c2.a r2 = (p032c2.C0853a) r2
                b2.a<?> r0 = r2.f4619c
                r0.mo2200a()
                d2.c r2 = r2.f4618b
                r0 = 0
                r2.f6742e = r0
                r2.f6741d = r0
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: a */
    public static void m4023a(android.text.Spannable r5, java.lang.Object r6, int r7, int r8, int r9) {
            java.lang.Class r0 = r6.getClass()
            java.lang.Object[] r0 = r5.getSpans(r7, r8, r0)
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L26
            r3 = r0[r2]
            int r4 = r5.getSpanStart(r3)
            if (r4 != r7) goto L23
            int r4 = r5.getSpanEnd(r3)
            if (r4 != r8) goto L23
            int r4 = r5.getSpanFlags(r3)
            if (r4 != r9) goto L23
            r5.removeSpan(r3)
        L23:
            int r2 = r2 + 1
            goto La
        L26:
            r5.setSpan(r6, r7, r8, r9)
            return
    }

    /* renamed from: b */
    public static java.util.List<byte[]> m4024b(byte[] r4) {
            r0 = 11
            r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r1 = 10
            r1 = r4[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            long r0 = (long) r0
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 * r2
            r2 = 48000(0xbb80, double:2.3715E-319)
            long r0 = r0 / r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 3
            r2.<init>(r3)
            r2.add(r4)
            byte[] r4 = m4025c(r0)
            r2.add(r4)
            r0 = 80000000(0x4c4b400, double:3.95252517E-316)
            byte[] r4 = m4025c(r0)
            r2.add(r4)
            return r2
    }

    /* renamed from: c */
    public static byte[] m4025c(long r2) {
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            java.nio.ByteBuffer r2 = r0.putLong(r2)
            byte[] r2 = r2.array()
            return r2
    }

    /* renamed from: d */
    public static int m4026d(int r0) {
            if (r0 < 0) goto L3
            return r0
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    /* renamed from: e */
    public static <T> T m4027e(T r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: f */
    public static java.lang.String m4028f(java.lang.String r3) {
            r0 = 5
            int r0 = p064e.C1489c.m4038a(r3, r0)
            int r0 = p064e.C1489c.m4038a(r3, r0)
            java.lang.String r1 = "."
            java.lang.String r2 = ",."
            java.lang.StringBuilder r3 = p064e.C1491e.m4040a(r0, r1, r3, r2, r3)
            java.lang.String r0 = " *"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    /* renamed from: g */
    public static void m4029g(android.media.MediaFormat r1, java.lang.String r2, int r3) {
            r0 = -1
            if (r3 == r0) goto L6
            r1.setInteger(r2, r3)
        L6:
            return
    }

    /* renamed from: h */
    public static android.view.inputmethod.InputConnection m4030h(android.view.inputmethod.InputConnection r1, android.view.inputmethod.EditorInfo r2, android.view.View r3) {
            if (r1 == 0) goto L20
            java.lang.CharSequence r0 = r2.hintText
            if (r0 != 0) goto L20
            android.view.ViewParent r3 = r3.getParent()
        La:
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L20
            boolean r0 = r3 instanceof androidx.appcompat.widget.InterfaceC0278g1
            if (r0 == 0) goto L1b
            androidx.appcompat.widget.g1 r3 = (androidx.appcompat.widget.InterfaceC0278g1) r3
            java.lang.CharSequence r3 = r3.m728a()
            r2.hintText = r3
            goto L20
        L1b:
            android.view.ViewParent r3 = r3.getParent()
            goto La
        L20:
            return r1
    }

    /* renamed from: i */
    public static void m4031i(android.media.MediaFormat r3, java.util.List<byte[]> r4) {
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L1f
            r1 = 15
            java.lang.String r2 = "csd-"
            java.lang.String r1 = p064e.C1490d.m4039a(r1, r2, r0)
            java.lang.Object r2 = r4.get(r0)
            byte[] r2 = (byte[]) r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            r3.setByteBuffer(r1, r2)
            int r0 = r0 + 1
            goto L1
        L1f:
            return
    }

    /* renamed from: j */
    public static final p032c2.InterfaceC0854b m4032j(androidx.recyclerview.widget.RecyclerView r9, mh.InterfaceC4620l<? super p003a2.C0005b, ch.C0985l> r10) {
            a2.b r0 = new a2.b
            r0.<init>(r9)
            r10.mo107b(r0)
            androidx.recyclerview.widget.RecyclerView$m r10 = r9.getLayoutManager()
            if (r10 != 0) goto L1a
            androidx.recyclerview.widget.LinearLayoutManager r10 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r9.getContext()
            r10.<init>(r1)
            r9.setLayoutManager(r10)
        L1a:
            b2.a<?> r10 = r0.f9b
            if (r10 == 0) goto L117
            c2.a r1 = new c2.a
            mh.a<? extends d2.c> r2 = r0.f10c
            java.lang.Object r2 = r2.mo15e()
            d2.c r2 = (p048d2.C1264c) r2
            e2.c r3 = r0.f8a
            java.util.Map<java.lang.Integer, a2.a<?, ?>> r4 = r3.f7344b
            boolean r4 = r4.isEmpty()
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L10b
            java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r3.f7343a
            int r4 = r4.size()
            java.util.Map<java.lang.String, java.lang.Integer> r6 = r3.f7345c
            int r6 = r6.size()
            r7 = 0
            if (r4 != r6) goto L45
            r4 = 1
            goto L46
        L45:
            r4 = 0
        L46:
            java.lang.String r6 = "Check failed."
            if (r4 == 0) goto L101
            java.util.Map<java.lang.Integer, a2.a<?, ?>> r4 = r3.f7344b
            int r4 = r4.size()
            java.util.Map<java.lang.String, java.lang.Integer> r8 = r3.f7345c
            int r8 = r8.size()
            if (r4 != r8) goto L59
            goto L5a
        L59:
            r5 = 0
        L5a:
            if (r5 == 0) goto Lf7
            r4 = 0
            r1.<init>(r4, r2, r10, r3)
            d2.c r2 = r1.f4618b
            e2.c r0 = r0.f8a
            java.util.Map<java.lang.Integer, a2.a<?, ?>> r0 = r0.f7344b
            java.util.Collection r0 = r0.values()
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L75
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L75
            goto L8d
        L75:
            java.util.Iterator r5 = r0.iterator()
        L79:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r5.next()
            a2.a r6 = (p003a2.InterfaceC0004a) r6
            boolean r8 = r6 instanceof p067e2.C1511d
            if (r8 != 0) goto L8a
            r6 = r4
        L8a:
            e2.d r6 = (p067e2.C1511d) r6
            goto L79
        L8d:
            if (r3 == 0) goto L96
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L96
            goto Lae
        L96:
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r0 = r0.next()
            a2.a r0 = (p003a2.InterfaceC0004a) r0
            boolean r3 = r0 instanceof p067e2.C1511d
            if (r3 != 0) goto Lab
            goto Lac
        Lab:
            r4 = r0
        Lac:
            e2.d r4 = (p067e2.C1511d) r4
        Lae:
            androidx.recyclerview.widget.RecyclerView$f r0 = r2.f3228a
            boolean r0 = r0.m1812a()
            if (r0 != 0) goto Lef
            r2.f3229b = r7
            r10.mo2203d(r1)
            d2.c r10 = r1.f4618b
            r9.setAdapter(r10)
            e.a$a r10 = new e.a$a
            r10.<init>(r1)
            d2.e r0 = new d2.e
            r0.<init>(r10)
            r9.addOnAttachStateChangeListener(r0)
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10587b(r9)
            if (r0 == 0) goto Ld8
            r10.mo107b(r9)
        Ld8:
            e.a$b r10 = new e.a$b
            r10.<init>(r1)
            d2.f r0 = new d2.f
            r0.<init>(r10)
            r9.addOnAttachStateChangeListener(r0)
            boolean r0 = p227n0.C4661t.f.m10587b(r9)
            if (r0 != 0) goto Lee
            r10.mo107b(r9)
        Lee:
            return r1
        Lef:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Cannot change whether this adapter has stable IDs while the adapter has registered observers."
            r9.<init>(r10)
            throw r9
        Lf7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = r6.toString()
            r9.<init>(r10)
            throw r9
        L101:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = r6.toString()
            r9.<init>(r10)
            throw r9
        L10b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "No bindings defined."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L117:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Must set a data source."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    /* renamed from: k */
    public static java.lang.String m4033k(int r5) {
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = android.graphics.Color.red(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = android.graphics.Color.green(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = android.graphics.Color.blue(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r5 = android.graphics.Color.alpha(r5)
            double r1 = (double) r5
            r3 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r1 = r1 / r3
            java.lang.Double r5 = java.lang.Double.valueOf(r1)
            r1 = 3
            r0[r1] = r5
            java.lang.String r5 = "rgba(%d,%d,%d,%.3f)"
            java.lang.String r5 = p371v5.C6552b0.m13318k(r5, r0)
            return r5
    }
}
