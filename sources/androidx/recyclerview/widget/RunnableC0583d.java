package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class RunnableC0583d implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ java.util.List f3383Y;

    /* renamed from: Z */
    public final /* synthetic */ java.util.List f3384Z;

    /* renamed from: a0 */
    public final /* synthetic */ int f3385a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.lang.Runnable f3386b0;

    /* renamed from: c0 */
    public final /* synthetic */ androidx.recyclerview.widget.C0585e f3387c0;

    /* renamed from: androidx.recyclerview.widget.d$a */
    public class a extends androidx.recyclerview.widget.C0604o.b {

        /* renamed from: a */
        public final /* synthetic */ androidx.recyclerview.widget.RunnableC0583d f3388a;

        public a(androidx.recyclerview.widget.RunnableC0583d r1) {
                r0 = this;
                r0.f3388a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C0604o.b
        /* renamed from: a */
        public boolean mo2017a(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.d r0 = r1.f3388a
                java.util.List r0 = r0.f3383Y
                java.lang.Object r2 = r0.get(r2)
                androidx.recyclerview.widget.d r0 = r1.f3388a
                java.util.List r0 = r0.f3384Z
                java.lang.Object r3 = r0.get(r3)
                if (r2 == 0) goto L21
                if (r3 == 0) goto L21
                androidx.recyclerview.widget.d r0 = r1.f3388a
                androidx.recyclerview.widget.e r0 = r0.f3387c0
                androidx.recyclerview.widget.c<T> r0 = r0.f3394b
                androidx.recyclerview.widget.o$e<T> r0 = r0.f3375b
                boolean r2 = r0.mo2099a(r2, r3)
                return r2
            L21:
                if (r2 != 0) goto L27
                if (r3 != 0) goto L27
                r2 = 1
                return r2
            L27:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
        }

        @Override // androidx.recyclerview.widget.C0604o.b
        /* renamed from: b */
        public boolean mo2018b(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.d r0 = r1.f3388a
                java.util.List r0 = r0.f3383Y
                java.lang.Object r2 = r0.get(r2)
                androidx.recyclerview.widget.d r0 = r1.f3388a
                java.util.List r0 = r0.f3384Z
                java.lang.Object r3 = r0.get(r3)
                if (r2 == 0) goto L21
                if (r3 == 0) goto L21
                androidx.recyclerview.widget.d r0 = r1.f3388a
                androidx.recyclerview.widget.e r0 = r0.f3387c0
                androidx.recyclerview.widget.c<T> r0 = r0.f3394b
                androidx.recyclerview.widget.o$e<T> r0 = r0.f3375b
                boolean r2 = r0.mo2100b(r2, r3)
                return r2
            L21:
                if (r2 != 0) goto L27
                if (r3 != 0) goto L27
                r2 = 1
                goto L28
            L27:
                r2 = 0
            L28:
                return r2
        }

        @Override // androidx.recyclerview.widget.C0604o.b
        /* renamed from: c */
        public java.lang.Object mo2019c(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.d r0 = r1.f3388a
                java.util.List r0 = r0.f3383Y
                java.lang.Object r2 = r0.get(r2)
                androidx.recyclerview.widget.d r0 = r1.f3388a
                java.util.List r0 = r0.f3384Z
                java.lang.Object r3 = r0.get(r3)
                if (r2 == 0) goto L21
                if (r3 == 0) goto L21
                androidx.recyclerview.widget.d r0 = r1.f3388a
                androidx.recyclerview.widget.e r0 = r0.f3387c0
                androidx.recyclerview.widget.c<T> r0 = r0.f3394b
                androidx.recyclerview.widget.o$e<T> r0 = r0.f3375b
                java.lang.Object r2 = r0.mo2101c(r2, r3)
                return r2
            L21:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
        }

        @Override // androidx.recyclerview.widget.C0604o.b
        /* renamed from: d */
        public int mo2020d() {
                r1 = this;
                androidx.recyclerview.widget.d r0 = r1.f3388a
                java.util.List r0 = r0.f3384Z
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.C0604o.b
        /* renamed from: e */
        public int mo2021e() {
                r1 = this;
                androidx.recyclerview.widget.d r0 = r1.f3388a
                java.util.List r0 = r0.f3383Y
                int r0 = r0.size()
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.recyclerview.widget.C0604o.d f3389Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.recyclerview.widget.RunnableC0583d f3390Z;

        public b(androidx.recyclerview.widget.RunnableC0583d r1, androidx.recyclerview.widget.C0604o.d r2) {
                r0 = this;
                r0.f3390Z = r1
                r0.f3389Y = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                androidx.recyclerview.widget.d r0 = r5.f3390Z
                androidx.recyclerview.widget.e r1 = r0.f3387c0
                int r2 = r1.f3399g
                int r3 = r0.f3385a0
                if (r2 != r3) goto L22
                java.util.List r2 = r0.f3384Z
                androidx.recyclerview.widget.o$d r3 = r5.f3389Y
                java.lang.Runnable r0 = r0.f3386b0
                java.util.List<T> r4 = r1.f3398f
                r1.f3397e = r2
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f3398f = r2
                androidx.recyclerview.widget.y r2 = r1.f3393a
                r3.m2098a(r2)
                r1.m2024a(r4, r0)
            L22:
                return
        }
    }

    public RunnableC0583d(androidx.recyclerview.widget.C0585e r1, java.util.List r2, java.util.List r3, int r4, java.lang.Runnable r5) {
            r0 = this;
            r0.f3387c0 = r1
            r0.f3383Y = r2
            r0.f3384Z = r3
            r0.f3385a0 = r4
            r0.f3386b0 = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            androidx.recyclerview.widget.d$a r0 = new androidx.recyclerview.widget.d$a
            r0.<init>(r3)
            androidx.recyclerview.widget.o$d r0 = androidx.recyclerview.widget.C0604o.m2096a(r0)
            androidx.recyclerview.widget.e r1 = r3.f3387c0
            java.util.concurrent.Executor r1 = r1.f3395c
            androidx.recyclerview.widget.d$b r2 = new androidx.recyclerview.widget.d$b
            r2.<init>(r3, r0)
            r1.execute(r2)
            return
    }
}
