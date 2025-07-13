package p264p0;

/* renamed from: p0.e */
/* loaded from: classes.dex */
public final class C5341e {

    /* renamed from: a */
    public final p264p0.C5341e.c f21234a;

    /* renamed from: p0.e$a */
    public static final class a implements p264p0.C5341e.c {

        /* renamed from: a */
        public final android.view.inputmethod.InputContentInfo f21235a;

        public a(android.net.Uri r2, android.content.ClipDescription r3, android.net.Uri r4) {
                r1 = this;
                r1.<init>()
                android.view.inputmethod.InputContentInfo r0 = new android.view.inputmethod.InputContentInfo
                r0.<init>(r2, r3, r4)
                r1.f21235a = r0
                return
        }

        public a(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                android.view.inputmethod.InputContentInfo r1 = (android.view.inputmethod.InputContentInfo) r1
                r0.f21235a = r1
                return
        }

        @Override // p264p0.C5341e.c
        /* renamed from: a */
        public android.content.ClipDescription mo11644a() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.f21235a
                android.content.ClipDescription r0 = r0.getDescription()
                return r0
        }

        @Override // p264p0.C5341e.c
        /* renamed from: b */
        public java.lang.Object mo11645b() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.f21235a
                return r0
        }

        @Override // p264p0.C5341e.c
        /* renamed from: c */
        public android.net.Uri mo11646c() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.f21235a
                android.net.Uri r0 = r0.getContentUri()
                return r0
        }

        @Override // p264p0.C5341e.c
        /* renamed from: d */
        public void mo11647d() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.f21235a
                r0.requestPermission()
                return
        }

        @Override // p264p0.C5341e.c
        /* renamed from: e */
        public android.net.Uri mo11648e() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.f21235a
                android.net.Uri r0 = r0.getLinkUri()
                return r0
        }
    }

    /* renamed from: p0.e$b */
    public static final class b implements p264p0.C5341e.c {

        /* renamed from: a */
        public final android.net.Uri f21236a;

        /* renamed from: b */
        public final android.content.ClipDescription f21237b;

        /* renamed from: c */
        public final android.net.Uri f21238c;

        public b(android.net.Uri r1, android.content.ClipDescription r2, android.net.Uri r3) {
                r0 = this;
                r0.<init>()
                r0.f21236a = r1
                r0.f21237b = r2
                r0.f21238c = r3
                return
        }

        @Override // p264p0.C5341e.c
        /* renamed from: a */
        public android.content.ClipDescription mo11644a() {
                r1 = this;
                android.content.ClipDescription r0 = r1.f21237b
                return r0
        }

        @Override // p264p0.C5341e.c
        /* renamed from: b */
        public java.lang.Object mo11645b() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // p264p0.C5341e.c
        /* renamed from: c */
        public android.net.Uri mo11646c() {
                r1 = this;
                android.net.Uri r0 = r1.f21236a
                return r0
        }

        @Override // p264p0.C5341e.c
        /* renamed from: d */
        public void mo11647d() {
                r0 = this;
                return
        }

        @Override // p264p0.C5341e.c
        /* renamed from: e */
        public android.net.Uri mo11648e() {
                r1 = this;
                android.net.Uri r0 = r1.f21238c
                return r0
        }
    }

    /* renamed from: p0.e$c */
    public interface c {
        /* renamed from: a */
        android.content.ClipDescription mo11644a();

        /* renamed from: b */
        java.lang.Object mo11645b();

        /* renamed from: c */
        android.net.Uri mo11646c();

        /* renamed from: d */
        void mo11647d();

        /* renamed from: e */
        android.net.Uri mo11648e();
    }

    public C5341e(android.net.Uri r3, android.content.ClipDescription r4, android.net.Uri r5) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto Lf
            p0.e$a r0 = new p0.e$a
            r0.<init>(r3, r4, r5)
            goto L14
        Lf:
            p0.e$b r0 = new p0.e$b
            r0.<init>(r3, r4, r5)
        L14:
            r2.f21234a = r0
            return
    }

    public C5341e(p264p0.C5341e.c r1) {
            r0 = this;
            r0.<init>()
            r0.f21234a = r1
            return
    }
}
