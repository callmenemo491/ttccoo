package p362uh;

/* renamed from: uh.b */
/* loaded from: classes.dex */
public final class C6456b implements th.InterfaceC6246d<p316rh.C5854c> {

    /* renamed from: a */
    public final java.lang.CharSequence f25037a;

    /* renamed from: b */
    public final int f25038b;

    /* renamed from: c */
    public final int f25039c;

    /* renamed from: d */
    public final mh.InterfaceC4624p<java.lang.CharSequence, java.lang.Integer, ch.C0978e<java.lang.Integer, java.lang.Integer>> f25040d;

    /* renamed from: uh.b$a */
    public static final class a implements java.util.Iterator<p316rh.C5854c>, p259oh.InterfaceC5277a {

        /* renamed from: Y */
        public int f25041Y;

        /* renamed from: Z */
        public int f25042Z;

        /* renamed from: a0 */
        public int f25043a0;

        /* renamed from: b0 */
        public p316rh.C5854c f25044b0;

        /* renamed from: c0 */
        public int f25045c0;

        /* renamed from: d0 */
        public final /* synthetic */ p362uh.C6456b f25046d0;

        public a(p362uh.C6456b r3) {
                r2 = this;
                r2.f25046d0 = r3
                r2.<init>()
                r0 = -1
                r2.f25041Y = r0
                int r0 = r3.f25038b
                java.lang.CharSequence r3 = r3.f25037a
                int r3 = r3.length()
                r1 = 0
                int r3 = p209lh.C4304a.m9616j(r0, r1, r3)
                r2.f25042Z = r3
                r2.f25043a0 = r3
                return
        }

        /* renamed from: a */
        public final void m13042a() {
                r7 = this;
                int r0 = r7.f25043a0
                r1 = 0
                if (r0 >= 0) goto Lb
                r7.f25041Y = r1
                r0 = 0
                r7.f25044b0 = r0
                goto L7d
            Lb:
                uh.b r2 = r7.f25046d0
                int r3 = r2.f25039c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L1a
                int r6 = r7.f25045c0
                int r6 = r6 + r5
                r7.f25045c0 = r6
                if (r6 >= r3) goto L22
            L1a:
                java.lang.CharSequence r2 = r2.f25037a
                int r2 = r2.length()
                if (r0 <= r2) goto L32
            L22:
                rh.c r0 = new rh.c
                int r1 = r7.f25042Z
                uh.b r2 = r7.f25046d0
                java.lang.CharSequence r2 = r2.f25037a
                int r2 = p362uh.C6467m.m13065V(r2)
                r0.<init>(r1, r2)
                goto L55
            L32:
                uh.b r0 = r7.f25046d0
                mh.p<java.lang.CharSequence, java.lang.Integer, ch.e<java.lang.Integer, java.lang.Integer>> r2 = r0.f25040d
                java.lang.CharSequence r0 = r0.f25037a
                int r3 = r7.f25043a0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.mo122l(r0, r3)
                ch.e r0 = (ch.C0978e) r0
                if (r0 != 0) goto L5a
                rh.c r0 = new rh.c
                int r1 = r7.f25042Z
                uh.b r2 = r7.f25046d0
                java.lang.CharSequence r2 = r2.f25037a
                int r2 = p362uh.C6467m.m13065V(r2)
                r0.<init>(r1, r2)
            L55:
                r7.f25044b0 = r0
                r7.f25043a0 = r4
                goto L7b
            L5a:
                A r2 = r0.f5050Y
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f5051Z
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f25042Z
                rh.c r3 = p209lh.C4304a.m9605K(r3, r2)
                r7.f25044b0 = r3
                int r2 = r2 + r0
                r7.f25042Z = r2
                if (r0 != 0) goto L78
                r1 = 1
            L78:
                int r2 = r2 + r1
                r7.f25043a0 = r2
            L7b:
                r7.f25041Y = r5
            L7d:
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f25041Y
                r1 = -1
                if (r0 != r1) goto L8
                r2.m13042a()
            L8:
                int r0 = r2.f25041Y
                r1 = 1
                if (r0 != r1) goto Le
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        @Override // java.util.Iterator
        public p316rh.C5854c next() {
                r3 = this;
                int r0 = r3.f25041Y
                r1 = -1
                if (r0 != r1) goto L8
                r3.m13042a()
            L8:
                int r0 = r3.f25041Y
                if (r0 == 0) goto L19
                rh.c r0 = r3.f25044b0
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.ranges.IntRange"
                java.util.Objects.requireNonNull(r0, r2)
                r2 = 0
                r3.f25044b0 = r2
                r3.f25041Y = r1
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    public C6456b(java.lang.CharSequence r2, int r3, int r4, mh.InterfaceC4624p<? super java.lang.CharSequence, ? super java.lang.Integer, ch.C0978e<java.lang.Integer, java.lang.Integer>> r5) {
            r1 = this;
            java.lang.String r0 = "input"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f25037a = r2
            r1.f25038b = r3
            r1.f25039c = r4
            r1.f25040d = r5
            return
    }

    @Override // th.InterfaceC6246d
    public java.util.Iterator<p316rh.C5854c> iterator() {
            r1 = this;
            uh.b$a r0 = new uh.b$a
            r0.<init>(r1)
            return r0
    }
}
