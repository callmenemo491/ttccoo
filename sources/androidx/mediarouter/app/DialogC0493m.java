package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.m */
/* loaded from: classes.dex */
public class DialogC0493m extends p083f.DialogC1929p {

    /* renamed from: a0 */
    public final p085f1.C1974o f2760a0;

    /* renamed from: b0 */
    public final androidx.mediarouter.app.DialogC0493m.c f2761b0;

    /* renamed from: c0 */
    public android.content.Context f2762c0;

    /* renamed from: d0 */
    public p085f1.C1973n f2763d0;

    /* renamed from: e0 */
    public java.util.List<p085f1.C1974o.i> f2764e0;

    /* renamed from: f0 */
    public androidx.mediarouter.app.DialogC0493m.d f2765f0;

    /* renamed from: g0 */
    public androidx.recyclerview.widget.RecyclerView f2766g0;

    /* renamed from: h0 */
    public boolean f2767h0;

    /* renamed from: i0 */
    public p085f1.C1974o.i f2768i0;

    /* renamed from: j0 */
    public long f2769j0;

    /* renamed from: k0 */
    public long f2770k0;

    /* renamed from: l0 */
    public final android.os.Handler f2771l0;

    /* renamed from: androidx.mediarouter.app.m$a */
    public class a extends android.os.Handler {

        /* renamed from: a */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0493m f2772a;

        public a(androidx.mediarouter.app.DialogC0493m r1) {
                r0 = this;
                r0.f2772a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 1
                if (r0 == r1) goto L6
                goto L24
            L6:
                androidx.mediarouter.app.m r0 = r3.f2772a
                java.lang.Object r4 = r4.obj
                java.util.List r4 = (java.util.List) r4
                java.util.Objects.requireNonNull(r0)
                long r1 = android.os.SystemClock.uptimeMillis()
                r0.f2770k0 = r1
                java.util.List<f1.o$i> r1 = r0.f2764e0
                r1.clear()
                java.util.List<f1.o$i> r1 = r0.f2764e0
                r1.addAll(r4)
                androidx.mediarouter.app.m$d r4 = r0.f2765f0
                r4.m1525i()
            L24:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.m$b */
    public class b implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0493m f2773Y;

        public b(androidx.mediarouter.app.DialogC0493m r1) {
                r0 = this;
                r0.f2773Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                androidx.mediarouter.app.m r1 = r0.f2773Y
                r1.dismiss()
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.m$c */
    public final class c extends p085f1.C1974o.b {

        /* renamed from: a */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0493m f2774a;

        public c(androidx.mediarouter.app.DialogC0493m r1) {
                r0 = this;
                r0.f2774a = r1
                r0.<init>()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: d */
        public void mo1488d(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.m r1 = r0.f2774a
                r1.m1518d()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: e */
        public void mo1489e(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.m r1 = r0.f2774a
                r1.m1518d()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: f */
        public void mo1490f(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.m r1 = r0.f2774a
                r1.m1518d()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: g */
        public void mo1491g(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.m r1 = r0.f2774a
                r1.dismiss()
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.m$d */
    public final class d extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> {

        /* renamed from: d */
        public final java.util.ArrayList<androidx.mediarouter.app.DialogC0493m.d.b> f2775d;

        /* renamed from: e */
        public final android.view.LayoutInflater f2776e;

        /* renamed from: f */
        public final android.graphics.drawable.Drawable f2777f;

        /* renamed from: g */
        public final android.graphics.drawable.Drawable f2778g;

        /* renamed from: h */
        public final android.graphics.drawable.Drawable f2779h;

        /* renamed from: i */
        public final android.graphics.drawable.Drawable f2780i;

        /* renamed from: j */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0493m f2781j;

        /* renamed from: androidx.mediarouter.app.m$d$a */
        public class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

            /* renamed from: u */
            public android.widget.TextView f2782u;

            public a(androidx.mediarouter.app.DialogC0493m.d r1, android.view.View r2) {
                    r0 = this;
                    r0.<init>(r2)
                    r1 = 2131362403(0x7f0a0263, float:1.8344586E38)
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.f2782u = r1
                    return
            }
        }

        /* renamed from: androidx.mediarouter.app.m$d$b */
        public class b {

            /* renamed from: a */
            public final java.lang.Object f2783a;

            /* renamed from: b */
            public final int f2784b;

            public b(androidx.mediarouter.app.DialogC0493m.d r1, java.lang.Object r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f2783a = r2
                    boolean r1 = r2 instanceof java.lang.String
                    if (r1 == 0) goto Lb
                    r1 = 1
                    goto L10
                Lb:
                    boolean r1 = r2 instanceof p085f1.C1974o.i
                    if (r1 == 0) goto L13
                    r1 = 2
                L10:
                    r0.f2784b = r1
                    goto L1d
                L13:
                    r1 = 0
                    r0.f2784b = r1
                    java.lang.String r1 = "RecyclerAdapter"
                    java.lang.String r2 = "Wrong type of data passed to Item constructor"
                    android.util.Log.w(r1, r2)
                L1d:
                    return
            }
        }

        /* renamed from: androidx.mediarouter.app.m$d$c */
        public class c extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

            /* renamed from: u */
            public final android.view.View f2785u;

            /* renamed from: v */
            public final android.widget.ImageView f2786v;

            /* renamed from: w */
            public final android.widget.ProgressBar f2787w;

            /* renamed from: x */
            public final android.widget.TextView f2788x;

            /* renamed from: y */
            public final /* synthetic */ androidx.mediarouter.app.DialogC0493m.d f2789y;

            public c(androidx.mediarouter.app.DialogC0493m.d r3, android.view.View r4) {
                    r2 = this;
                    r2.f2789y = r3
                    r2.<init>(r4)
                    r2.f2785u = r4
                    r0 = 2131362405(0x7f0a0265, float:1.834459E38)
                    android.view.View r0 = r4.findViewById(r0)
                    android.widget.ImageView r0 = (android.widget.ImageView) r0
                    r2.f2786v = r0
                    r0 = 2131362407(0x7f0a0267, float:1.8344594E38)
                    android.view.View r0 = r4.findViewById(r0)
                    android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                    r2.f2787w = r0
                    r1 = 2131362406(0x7f0a0266, float:1.8344592E38)
                    android.view.View r4 = r4.findViewById(r1)
                    android.widget.TextView r4 = (android.widget.TextView) r4
                    r2.f2788x = r4
                    androidx.mediarouter.app.m r3 = r3.f2781j
                    android.content.Context r3 = r3.f2762c0
                    androidx.mediarouter.app.C0498r.m1560l(r3, r0)
                    return
            }
        }

        public d(androidx.mediarouter.app.DialogC0493m r3) {
                r2 = this;
                r2.f2781j = r3
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f2775d = r0
                android.content.Context r0 = r3.f2762c0
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r2.f2776e = r0
                android.content.Context r0 = r3.f2762c0
                r1 = 2130969259(0x7f0402ab, float:1.7547195E38)
                android.graphics.drawable.Drawable r0 = androidx.mediarouter.app.C0498r.m1553e(r0, r1)
                r2.f2777f = r0
                android.content.Context r0 = r3.f2762c0
                r1 = 2130969268(0x7f0402b4, float:1.7547213E38)
                android.graphics.drawable.Drawable r0 = androidx.mediarouter.app.C0498r.m1553e(r0, r1)
                r2.f2778g = r0
                android.content.Context r0 = r3.f2762c0
                r1 = 2130969265(0x7f0402b1, float:1.7547207E38)
                android.graphics.drawable.Drawable r0 = androidx.mediarouter.app.C0498r.m1553e(r0, r1)
                r2.f2779h = r0
                android.content.Context r3 = r3.f2762c0
                r0 = 2130969264(0x7f0402b0, float:1.7547205E38)
                android.graphics.drawable.Drawable r3 = androidx.mediarouter.app.C0498r.m1553e(r3, r0)
                r2.f2780i = r3
                r2.m1525i()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
        /* renamed from: b */
        public int mo1521b() {
                r1 = this;
                java.util.ArrayList<androidx.mediarouter.app.m$d$b> r0 = r1.f2775d
                int r0 = r0.size()
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
        /* renamed from: d */
        public int mo1522d(int r2) {
                r1 = this;
                java.util.ArrayList<androidx.mediarouter.app.m$d$b> r0 = r1.f2775d
                java.lang.Object r2 = r0.get(r2)
                androidx.mediarouter.app.m$d$b r2 = (androidx.mediarouter.app.DialogC0493m.d.b) r2
                int r2 = r2.f2784b
                return r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
        /* renamed from: e */
        public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r9, int r10) {
                r8 = this;
                java.util.ArrayList<androidx.mediarouter.app.m$d$b> r0 = r8.f2775d
                java.lang.Object r0 = r0.get(r10)
                androidx.mediarouter.app.m$d$b r0 = (androidx.mediarouter.app.DialogC0493m.d.b) r0
                int r0 = r0.f2784b
                java.util.ArrayList<androidx.mediarouter.app.m$d$b> r1 = r8.f2775d
                java.lang.Object r10 = r1.get(r10)
                androidx.mediarouter.app.m$d$b r10 = (androidx.mediarouter.app.DialogC0493m.d.b) r10
                r1 = 1
                if (r0 == r1) goto L97
                java.lang.String r2 = "RecyclerAdapter"
                r3 = 2
                if (r0 == r3) goto L21
                java.lang.String r9 = "Cannot bind item to ViewHolder because of wrong view type"
                android.util.Log.w(r2, r9)
                goto La7
            L21:
                androidx.mediarouter.app.m$d$c r9 = (androidx.mediarouter.app.DialogC0493m.d.c) r9
                java.util.Objects.requireNonNull(r9)
                java.lang.Object r10 = r10.f2783a
                f1.o$i r10 = (p085f1.C1974o.i) r10
                android.view.View r0 = r9.f2785u
                r4 = 0
                r0.setVisibility(r4)
                android.widget.ProgressBar r0 = r9.f2787w
                r4 = 4
                r0.setVisibility(r4)
                android.view.View r0 = r9.f2785u
                androidx.mediarouter.app.n r4 = new androidx.mediarouter.app.n
                r4.<init>(r9, r10)
                r0.setOnClickListener(r4)
                android.widget.TextView r0 = r9.f2788x
                java.lang.String r4 = r10.f8736d
                r0.setText(r4)
                android.widget.ImageView r0 = r9.f2786v
                androidx.mediarouter.app.m$d r9 = r9.f2789y
                java.util.Objects.requireNonNull(r9)
                android.net.Uri r4 = r10.f8738f
                if (r4 == 0) goto L7b
                androidx.mediarouter.app.m r5 = r9.f2781j     // Catch: java.io.IOException -> L66
                android.content.Context r5 = r5.f2762c0     // Catch: java.io.IOException -> L66
                android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.io.IOException -> L66
                java.io.InputStream r5 = r5.openInputStream(r4)     // Catch: java.io.IOException -> L66
                r6 = 0
                android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r5, r6)     // Catch: java.io.IOException -> L66
                if (r2 == 0) goto L7b
                goto L93
            L66:
                r5 = move-exception
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Failed to load "
                r6.append(r7)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                android.util.Log.w(r2, r4, r5)
            L7b:
                int r2 = r10.f8745m
                if (r2 == r1) goto L90
                if (r2 == r3) goto L8d
                boolean r10 = r10.m5067f()
                if (r10 == 0) goto L8a
                android.graphics.drawable.Drawable r9 = r9.f2780i
                goto L92
            L8a:
                android.graphics.drawable.Drawable r9 = r9.f2777f
                goto L92
            L8d:
                android.graphics.drawable.Drawable r9 = r9.f2779h
                goto L92
            L90:
                android.graphics.drawable.Drawable r9 = r9.f2778g
            L92:
                r2 = r9
            L93:
                r0.setImageDrawable(r2)
                goto La7
            L97:
                androidx.mediarouter.app.m$d$a r9 = (androidx.mediarouter.app.DialogC0493m.d.a) r9
                java.util.Objects.requireNonNull(r9)
                java.lang.Object r10 = r10.f2783a
                java.lang.String r10 = r10.toString()
                android.widget.TextView r9 = r9.f2782u
                r9.setText(r10)
            La7:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
        /* renamed from: g */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r3, int r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                if (r4 == r0) goto L1f
                r0 = 2
                if (r4 == r0) goto L10
                java.lang.String r3 = "RecyclerAdapter"
                java.lang.String r4 = "Cannot create ViewHolder because of wrong view type"
                android.util.Log.w(r3, r4)
                r3 = 0
                return r3
            L10:
                android.view.LayoutInflater r4 = r2.f2776e
                r0 = 2131558518(0x7f0d0076, float:1.8742354E38)
                android.view.View r3 = r4.inflate(r0, r3, r1)
                androidx.mediarouter.app.m$d$c r4 = new androidx.mediarouter.app.m$d$c
                r4.<init>(r2, r3)
                return r4
            L1f:
                android.view.LayoutInflater r4 = r2.f2776e
                r0 = 2131558517(0x7f0d0075, float:1.8742352E38)
                android.view.View r3 = r4.inflate(r0, r3, r1)
                androidx.mediarouter.app.m$d$a r4 = new androidx.mediarouter.app.m$d$a
                r4.<init>(r2, r3)
                return r4
        }

        /* renamed from: i */
        public void m1525i() {
                r4 = this;
                java.util.ArrayList<androidx.mediarouter.app.m$d$b> r0 = r4.f2775d
                r0.clear()
                java.util.ArrayList<androidx.mediarouter.app.m$d$b> r0 = r4.f2775d
                androidx.mediarouter.app.m$d$b r1 = new androidx.mediarouter.app.m$d$b
                androidx.mediarouter.app.m r2 = r4.f2781j
                android.content.Context r2 = r2.f2762c0
                r3 = 2131951884(0x7f13010c, float:1.9540195E38)
                java.lang.String r2 = r2.getString(r3)
                r1.<init>(r4, r2)
                r0.add(r1)
                androidx.mediarouter.app.m r0 = r4.f2781j
                java.util.List<f1.o$i> r0 = r0.f2764e0
                java.util.Iterator r0 = r0.iterator()
            L22:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L39
                java.lang.Object r1 = r0.next()
                f1.o$i r1 = (p085f1.C1974o.i) r1
                java.util.ArrayList<androidx.mediarouter.app.m$d$b> r2 = r4.f2775d
                androidx.mediarouter.app.m$d$b r3 = new androidx.mediarouter.app.m$d$b
                r3.<init>(r4, r1)
                r2.add(r3)
                goto L22
            L39:
                androidx.recyclerview.widget.RecyclerView$f r0 = r4.f3228a
                r0.m1813b()
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.m$e */
    public static final class e implements java.util.Comparator<p085f1.C1974o.i> {

        /* renamed from: Y */
        public static final androidx.mediarouter.app.DialogC0493m.e f2790Y = null;

        static {
                androidx.mediarouter.app.m$e r0 = new androidx.mediarouter.app.m$e
                r0.<init>()
                androidx.mediarouter.app.DialogC0493m.e.f2790Y = r0
                return
        }

        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(p085f1.C1974o.i r1, p085f1.C1974o.i r2) {
                r0 = this;
                f1.o$i r1 = (p085f1.C1974o.i) r1
                f1.o$i r2 = (p085f1.C1974o.i) r2
                java.lang.String r1 = r1.f8736d
                java.lang.String r2 = r2.f8736d
                int r1 = r1.compareToIgnoreCase(r2)
                return r1
        }
    }

    public DialogC0493m(android.content.Context r3) {
            r2 = this;
            r0 = 0
            android.content.Context r3 = androidx.mediarouter.app.C0498r.m1549a(r3, r0, r0)
            int r0 = androidx.mediarouter.app.C0498r.m1550b(r3)
            r2.<init>(r3, r0)
            f1.n r3 = p085f1.C1973n.f8666c
            r2.f2763d0 = r3
            androidx.mediarouter.app.m$a r3 = new androidx.mediarouter.app.m$a
            r3.<init>(r2)
            r2.f2771l0 = r3
            android.content.Context r3 = r2.getContext()
            f1.o r0 = p085f1.C1974o.m5026d(r3)
            r2.f2760a0 = r0
            androidx.mediarouter.app.m$c r0 = new androidx.mediarouter.app.m$c
            r0.<init>(r2)
            r2.f2761b0 = r0
            r2.f2762c0 = r3
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131427356(0x7f0b001c, float:1.8476326E38)
            int r3 = r3.getInteger(r0)
            long r0 = (long) r3
            r2.f2769j0 = r0
            return
    }

    /* renamed from: d */
    public void m1518d() {
            r7 = this;
            f1.o$i r0 = r7.f2768i0
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r7.f2767h0
            if (r0 == 0) goto L79
            java.util.ArrayList r0 = new java.util.ArrayList
            f1.o r1 = r7.f2760a0
            java.util.List r1 = r1.m5030f()
            r0.<init>(r1)
            int r1 = r0.size()
        L18:
            int r2 = r1 + (-1)
            r3 = 1
            if (r1 <= 0) goto L3e
            java.lang.Object r1 = r0.get(r2)
            f1.o$i r1 = (p085f1.C1974o.i) r1
            boolean r4 = r1.m5066e()
            if (r4 != 0) goto L36
            boolean r4 = r1.f8739g
            if (r4 == 0) goto L36
            f1.n r4 = r7.f2763d0
            boolean r1 = r1.m5070i(r4)
            if (r1 == 0) goto L36
            goto L37
        L36:
            r3 = 0
        L37:
            if (r3 != 0) goto L3c
            r0.remove(r2)
        L3c:
            r1 = r2
            goto L18
        L3e:
            androidx.mediarouter.app.m$e r1 = androidx.mediarouter.app.DialogC0493m.e.f2790Y
            java.util.Collections.sort(r0, r1)
            long r1 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.f2770k0
            long r1 = r1 - r4
            long r4 = r7.f2769j0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L66
            long r1 = android.os.SystemClock.uptimeMillis()
            r7.f2770k0 = r1
            java.util.List<f1.o$i> r1 = r7.f2764e0
            r1.clear()
            java.util.List<f1.o$i> r1 = r7.f2764e0
            r1.addAll(r0)
            androidx.mediarouter.app.m$d r0 = r7.f2765f0
            r0.m1525i()
            goto L79
        L66:
            android.os.Handler r1 = r7.f2771l0
            r1.removeMessages(r3)
            android.os.Handler r1 = r7.f2771l0
            android.os.Message r0 = r1.obtainMessage(r3, r0)
            long r2 = r7.f2770k0
            long r4 = r7.f2769j0
            long r2 = r2 + r4
            r1.sendMessageAtTime(r0, r2)
        L79:
            return
    }

    /* renamed from: e */
    public void m1519e(p085f1.C1973n r4) {
            r3 = this;
            if (r4 == 0) goto L23
            f1.n r0 = r3.f2763d0
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L22
            r3.f2763d0 = r4
            boolean r0 = r3.f2767h0
            if (r0 == 0) goto L1f
            f1.o r0 = r3.f2760a0
            androidx.mediarouter.app.m$c r1 = r3.f2761b0
            r0.m5033i(r1)
            f1.o r0 = r3.f2760a0
            androidx.mediarouter.app.m$c r1 = r3.f2761b0
            r2 = 1
            r0.m5027a(r4, r1, r2)
        L1f:
            r3.m1518d()
        L22:
            return
        L23:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "selector must not be null"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: f */
    public void m1520f() {
            r3 = this;
            android.content.Context r0 = r3.f2762c0
            int r0 = androidx.mediarouter.app.C0492l.m1517b(r0)
            android.content.Context r1 = r3.f2762c0
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131034115(0x7f050003, float:1.7678738E38)
            boolean r1 = r1.getBoolean(r2)
            if (r1 != 0) goto L17
            r1 = -1
            goto L18
        L17:
            r1 = -2
        L18:
            android.view.Window r2 = r3.getWindow()
            r2.setLayout(r0, r1)
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            r0 = 1
            r4.f2767h0 = r0
            f1.o r1 = r4.f2760a0
            f1.n r2 = r4.f2763d0
            androidx.mediarouter.app.m$c r3 = r4.f2761b0
            r1.m5027a(r2, r3, r0)
            r4.m1518d()
            return
    }

    @Override // p083f.DialogC1929p, android.app.Dialog
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            r3 = 2131558516(0x7f0d0074, float:1.874235E38)
            r2.setContentView(r3)
            android.content.Context r3 = r2.f2762c0
            androidx.mediarouter.app.C0498r.m1559k(r3, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f2764e0 = r3
            r3 = 2131362402(0x7f0a0262, float:1.8344584E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            androidx.mediarouter.app.m$b r0 = new androidx.mediarouter.app.m$b
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            androidx.mediarouter.app.m$d r3 = new androidx.mediarouter.app.m$d
            r3.<init>(r2)
            r2.f2765f0 = r3
            r3 = 2131362404(0x7f0a0264, float:1.8344588E38)
            android.view.View r3 = r2.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r2.f2766g0 = r3
            androidx.mediarouter.app.m$d r0 = r2.f2765f0
            r3.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r3 = r2.f2766g0
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r2.f2762c0
            r0.<init>(r1)
            r3.setLayoutManager(r0)
            r2.m1520f()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r2.f2767h0 = r0
            f1.o r0 = r2.f2760a0
            androidx.mediarouter.app.m$c r1 = r2.f2761b0
            r0.m5033i(r1)
            android.os.Handler r0 = r2.f2771l0
            r1 = 1
            r0.removeMessages(r1)
            return
    }
}
