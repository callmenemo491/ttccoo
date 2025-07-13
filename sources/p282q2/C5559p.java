package p282q2;

/* renamed from: q2.p */
/* loaded from: classes.dex */
public class C5559p<Model, Data> implements p282q2.InterfaceC5556m<Model, Data> {

    /* renamed from: a */
    public final java.util.List<p282q2.InterfaceC5556m<Model, Data>> f21631a;

    /* renamed from: b */
    public final p212m0.InterfaceC4313c<java.util.List<java.lang.Throwable>> f21632b;

    /* renamed from: q2.p$a */
    public static class a<Data> implements com.bumptech.glide.load.data.InterfaceC1016d<Data>, com.bumptech.glide.load.data.InterfaceC1016d.a<Data> {

        /* renamed from: Y */
        public final java.util.List<com.bumptech.glide.load.data.InterfaceC1016d<Data>> f21633Y;

        /* renamed from: Z */
        public final p212m0.InterfaceC4313c<java.util.List<java.lang.Throwable>> f21634Z;

        /* renamed from: a0 */
        public int f21635a0;

        /* renamed from: b0 */
        public com.bumptech.glide.EnumC1003g f21636b0;

        /* renamed from: c0 */
        public com.bumptech.glide.load.data.InterfaceC1016d.a<? super Data> f21637c0;

        /* renamed from: d0 */
        public java.util.List<java.lang.Throwable> f21638d0;

        /* renamed from: e0 */
        public boolean f21639e0;

        public a(java.util.List<com.bumptech.glide.load.data.InterfaceC1016d<Data>> r1, p212m0.InterfaceC4313c<java.util.List<java.lang.Throwable>> r2) {
                r0 = this;
                r0.<init>()
                r0.f21634Z = r2
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto L11
                r0.f21633Y = r1
                r1 = 0
                r0.f21635a0 = r1
                return
            L11:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Must not be empty."
                r1.<init>(r2)
                throw r1
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: a */
        public java.lang.Class<Data> mo2786a() {
                r2 = this;
                java.util.List<com.bumptech.glide.load.data.d<Data>> r0 = r2.f21633Y
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                com.bumptech.glide.load.data.d r0 = (com.bumptech.glide.load.data.InterfaceC1016d) r0
                java.lang.Class r0 = r0.mo2786a()
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: b */
        public void mo2789b() {
                r2 = this;
                java.util.List<java.lang.Throwable> r0 = r2.f21638d0
                if (r0 == 0) goto L9
                m0.c<java.util.List<java.lang.Throwable>> r1 = r2.f21634Z
                r1.mo6230a(r0)
            L9:
                r0 = 0
                r2.f21638d0 = r0
                java.util.List<com.bumptech.glide.load.data.d<Data>> r0 = r2.f21633Y
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()
                com.bumptech.glide.load.data.d r1 = (com.bumptech.glide.load.data.InterfaceC1016d) r1
                r1.mo2789b()
                goto L12
            L22:
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d.a
        /* renamed from: c */
        public void mo2794c(java.lang.Exception r3) {
                r2 = this;
                java.util.List<java.lang.Throwable> r0 = r2.f21638d0
                java.lang.String r1 = "Argument must not be null"
                java.util.Objects.requireNonNull(r0, r1)
                r0.add(r3)
                r2.m11839g()
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        public void cancel() {
                r2 = this;
                r0 = 1
                r2.f21639e0 = r0
                java.util.List<com.bumptech.glide.load.data.d<Data>> r0 = r2.f21633Y
                java.util.Iterator r0 = r0.iterator()
            L9:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()
                com.bumptech.glide.load.data.d r1 = (com.bumptech.glide.load.data.InterfaceC1016d) r1
                r1.cancel()
                goto L9
            L19:
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d.a
        /* renamed from: d */
        public void mo2795d(Data r2) {
                r1 = this;
                if (r2 == 0) goto L8
                com.bumptech.glide.load.data.d$a<? super Data> r0 = r1.f21637c0
                r0.mo2795d(r2)
                goto Lb
            L8:
                r1.m11839g()
            Lb:
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: e */
        public com.bumptech.glide.load.EnumC1008a mo2792e() {
                r2 = this;
                java.util.List<com.bumptech.glide.load.data.d<Data>> r0 = r2.f21633Y
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                com.bumptech.glide.load.data.d r0 = (com.bumptech.glide.load.data.InterfaceC1016d) r0
                com.bumptech.glide.load.a r0 = r0.mo2792e()
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: f */
        public void mo2793f(com.bumptech.glide.EnumC1003g r2, com.bumptech.glide.load.data.InterfaceC1016d.a<? super Data> r3) {
                r1 = this;
                r1.f21636b0 = r2
                r1.f21637c0 = r3
                m0.c<java.util.List<java.lang.Throwable>> r3 = r1.f21634Z
                java.lang.Object r3 = r3.mo6231b()
                java.util.List r3 = (java.util.List) r3
                r1.f21638d0 = r3
                java.util.List<com.bumptech.glide.load.data.d<Data>> r3 = r1.f21633Y
                int r0 = r1.f21635a0
                java.lang.Object r3 = r3.get(r0)
                com.bumptech.glide.load.data.d r3 = (com.bumptech.glide.load.data.InterfaceC1016d) r3
                r3.mo2793f(r2, r1)
                boolean r2 = r1.f21639e0
                if (r2 == 0) goto L22
                r1.cancel()
            L22:
                return
        }

        /* renamed from: g */
        public final void m11839g() {
                r4 = this;
                boolean r0 = r4.f21639e0
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r4.f21635a0
                java.util.List<com.bumptech.glide.load.data.d<Data>> r1 = r4.f21633Y
                int r1 = r1.size()
                int r1 = r1 + (-1)
                if (r0 >= r1) goto L1f
                int r0 = r4.f21635a0
                int r0 = r0 + 1
                r4.f21635a0 = r0
                com.bumptech.glide.g r0 = r4.f21636b0
                com.bumptech.glide.load.data.d$a<? super Data> r1 = r4.f21637c0
                r4.mo2793f(r0, r1)
                goto L39
            L1f:
                java.util.List<java.lang.Throwable> r0 = r4.f21638d0
                java.lang.String r1 = "Argument must not be null"
                java.util.Objects.requireNonNull(r0, r1)
                com.bumptech.glide.load.data.d$a<? super Data> r0 = r4.f21637c0
                m2.s r1 = new m2.s
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.List<java.lang.Throwable> r3 = r4.f21638d0
                r2.<init>(r3)
                java.lang.String r3 = "Fetch failed"
                r1.<init>(r3, r2)
                r0.mo2794c(r1)
            L39:
                return
        }
    }

    public C5559p(java.util.List<p282q2.InterfaceC5556m<Model, Data>> r1, p212m0.InterfaceC4313c<java.util.List<java.lang.Throwable>> r2) {
            r0 = this;
            r0.<init>()
            r0.f21631a = r1
            r0.f21632b = r2
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a<Data> mo9582a(Model r8, int r9, int r10, p180k2.C3673e r11) {
            r7 = this;
            java.util.List<q2.m<Model, Data>> r0 = r7.f21631a
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 0
            r4 = r2
        Le:
            if (r3 >= r0) goto L2e
            java.util.List<q2.m<Model, Data>> r5 = r7.f21631a
            java.lang.Object r5 = r5.get(r3)
            q2.m r5 = (p282q2.InterfaceC5556m) r5
            boolean r6 = r5.mo9583b(r8)
            if (r6 == 0) goto L2b
            q2.m$a r5 = r5.mo9582a(r8, r9, r10, r11)
            if (r5 == 0) goto L2b
            k2.c r4 = r5.f21624a
            com.bumptech.glide.load.data.d<Data> r5 = r5.f21626c
            r1.add(r5)
        L2b:
            int r3 = r3 + 1
            goto Le
        L2e:
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L42
            if (r4 == 0) goto L42
            q2.m$a r2 = new q2.m$a
            q2.p$a r8 = new q2.p$a
            m0.c<java.util.List<java.lang.Throwable>> r9 = r7.f21632b
            r8.<init>(r1, r9)
            r2.<init>(r4, r8)
        L42:
            return r2
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public boolean mo9583b(Model r3) {
            r2 = this;
            java.util.List<q2.m<Model, Data>> r0 = r2.f21631a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            q2.m r1 = (p282q2.InterfaceC5556m) r1
            boolean r1 = r1.mo9583b(r3)
            if (r1 == 0) goto L6
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "MultiModelLoader{modelLoaders="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<q2.m<Model, Data>> r1 = r2.f21631a
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
