package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.b */
/* loaded from: classes.dex */
public class DialogC0482b extends p083f.DialogC1929p {

    /* renamed from: a0 */
    public final p085f1.C1974o f2643a0;

    /* renamed from: b0 */
    public final androidx.mediarouter.app.DialogC0482b.b f2644b0;

    /* renamed from: c0 */
    public android.widget.TextView f2645c0;

    /* renamed from: d0 */
    public p085f1.C1973n f2646d0;

    /* renamed from: e0 */
    public java.util.ArrayList<p085f1.C1974o.i> f2647e0;

    /* renamed from: f0 */
    public androidx.mediarouter.app.DialogC0482b.c f2648f0;

    /* renamed from: g0 */
    public android.widget.ListView f2649g0;

    /* renamed from: h0 */
    public boolean f2650h0;

    /* renamed from: i0 */
    public long f2651i0;

    /* renamed from: j0 */
    public final android.os.Handler f2652j0;

    /* renamed from: androidx.mediarouter.app.b$a */
    public class a extends android.os.Handler {

        /* renamed from: a */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0482b f2653a;

        public a(androidx.mediarouter.app.DialogC0482b r1) {
                r0 = this;
                r0.f2653a = r1
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
                androidx.mediarouter.app.b r0 = r3.f2653a
                java.lang.Object r4 = r4.obj
                java.util.List r4 = (java.util.List) r4
                java.util.Objects.requireNonNull(r0)
                long r1 = android.os.SystemClock.uptimeMillis()
                r0.f2651i0 = r1
                java.util.ArrayList<f1.o$i> r1 = r0.f2647e0
                r1.clear()
                java.util.ArrayList<f1.o$i> r1 = r0.f2647e0
                r1.addAll(r4)
                androidx.mediarouter.app.b$c r4 = r0.f2648f0
                r4.notifyDataSetChanged()
            L24:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.b$b */
    public final class b extends p085f1.C1974o.b {

        /* renamed from: a */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0482b f2654a;

        public b(androidx.mediarouter.app.DialogC0482b r1) {
                r0 = this;
                r0.f2654a = r1
                r0.<init>()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: d */
        public void mo1488d(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.b r1 = r0.f2654a
                r1.m1493d()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: e */
        public void mo1489e(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.b r1 = r0.f2654a
                r1.m1493d()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: f */
        public void mo1490f(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.b r1 = r0.f2654a
                r1.m1493d()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: g */
        public void mo1491g(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.b r1 = r0.f2654a
                r1.dismiss()
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.b$c */
    public static final class c extends android.widget.ArrayAdapter<p085f1.C1974o.i> implements android.widget.AdapterView.OnItemClickListener {

        /* renamed from: Y */
        public final android.view.LayoutInflater f2655Y;

        /* renamed from: Z */
        public final android.graphics.drawable.Drawable f2656Z;

        /* renamed from: a0 */
        public final android.graphics.drawable.Drawable f2657a0;

        /* renamed from: b0 */
        public final android.graphics.drawable.Drawable f2658b0;

        /* renamed from: c0 */
        public final android.graphics.drawable.Drawable f2659c0;

        public c(android.content.Context r2, java.util.List<p085f1.C1974o.i> r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0, r3)
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                r1.f2655Y = r2
                android.content.Context r2 = r1.getContext()
                r3 = 4
                int[] r3 = new int[r3]
                r3 = {x0038: FILL_ARRAY_DATA , data: [2130969259, 2130969268, 2130969265, 2130969264} // fill-array
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3)
                android.graphics.drawable.Drawable r3 = r2.getDrawable(r0)
                r1.f2656Z = r3
                r3 = 1
                android.graphics.drawable.Drawable r3 = r2.getDrawable(r3)
                r1.f2657a0 = r3
                r3 = 2
                android.graphics.drawable.Drawable r3 = r2.getDrawable(r3)
                r1.f2658b0 = r3
                r3 = 3
                android.graphics.drawable.Drawable r3 = r2.getDrawable(r3)
                r1.f2659c0 = r3
                r2.recycle()
                return
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
                r6 = this;
                r0 = 0
                if (r8 != 0) goto Lc
                android.view.LayoutInflater r8 = r6.f2655Y
                r1 = 2131558513(0x7f0d0071, float:1.8742344E38)
                android.view.View r8 = r8.inflate(r1, r9, r0)
            Lc:
                java.lang.Object r7 = r6.getItem(r7)
                f1.o$i r7 = (p085f1.C1974o.i) r7
                r9 = 2131362385(0x7f0a0251, float:1.834455E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.TextView r9 = (android.widget.TextView) r9
                r1 = 2131362383(0x7f0a024f, float:1.8344545E38)
                android.view.View r1 = r8.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r2 = r7.f8736d
                r9.setText(r2)
                java.lang.String r2 = r7.f8737e
                int r3 = r7.f8740h
                r4 = 2
                r5 = 1
                if (r3 == r4) goto L36
                if (r3 != r5) goto L34
                goto L36
            L34:
                r3 = 0
                goto L37
            L36:
                r3 = 1
            L37:
                if (r3 == 0) goto L4b
                boolean r3 = android.text.TextUtils.isEmpty(r2)
                if (r3 != 0) goto L4b
                r3 = 80
                r9.setGravity(r3)
                r1.setVisibility(r0)
                r1.setText(r2)
                goto L5a
            L4b:
                r0 = 16
                r9.setGravity(r0)
                r9 = 8
                r1.setVisibility(r9)
                java.lang.String r9 = ""
                r1.setText(r9)
            L5a:
                boolean r9 = r7.f8739g
                r8.setEnabled(r9)
                r9 = 2131362384(0x7f0a0250, float:1.8344547E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.ImageView r9 = (android.widget.ImageView) r9
                if (r9 == 0) goto Lb4
                android.net.Uri r0 = r7.f8738f
                if (r0 == 0) goto L99
                android.content.Context r1 = r6.getContext()     // Catch: java.io.IOException -> L82
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L82
                java.io.InputStream r1 = r1.openInputStream(r0)     // Catch: java.io.IOException -> L82
                r2 = 0
                android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch: java.io.IOException -> L82
                if (r0 == 0) goto L99
                goto Lb1
            L82:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to load "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                java.lang.String r2 = "MediaRouteChooserDialog"
                android.util.Log.w(r2, r0, r1)
            L99:
                int r0 = r7.f8745m
                if (r0 == r5) goto Lae
                if (r0 == r4) goto Lab
                boolean r7 = r7.m5067f()
                if (r7 == 0) goto La8
                android.graphics.drawable.Drawable r7 = r6.f2659c0
                goto Lb0
            La8:
                android.graphics.drawable.Drawable r7 = r6.f2656Z
                goto Lb0
            Lab:
                android.graphics.drawable.Drawable r7 = r6.f2658b0
                goto Lb0
            Lae:
                android.graphics.drawable.Drawable r7 = r6.f2657a0
            Lb0:
                r0 = r7
            Lb1:
                r9.setImageDrawable(r0)
            Lb4:
                return r8
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int r1) {
                r0 = this;
                java.lang.Object r1 = r0.getItem(r1)
                f1.o$i r1 = (p085f1.C1974o.i) r1
                boolean r1 = r1.f8739g
                return r1
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                java.lang.Object r1 = r0.getItem(r3)
                f1.o$i r1 = (p085f1.C1974o.i) r1
                boolean r3 = r1.f8739g
                if (r3 == 0) goto L28
                r3 = 2131362384(0x7f0a0250, float:1.8344547E38)
                android.view.View r3 = r2.findViewById(r3)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r4 = 2131362386(0x7f0a0252, float:1.8344551E38)
                android.view.View r2 = r2.findViewById(r4)
                android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
                r4 = 8
                r3.setVisibility(r4)
                r3 = 0
                r2.setVisibility(r3)
                r1.m5074m()
            L28:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.b$d */
    public static final class d implements java.util.Comparator<p085f1.C1974o.i> {

        /* renamed from: Y */
        public static final androidx.mediarouter.app.DialogC0482b.d f2660Y = null;

        static {
                androidx.mediarouter.app.b$d r0 = new androidx.mediarouter.app.b$d
                r0.<init>()
                androidx.mediarouter.app.DialogC0482b.d.f2660Y = r0
                return
        }

        public d() {
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

    public DialogC0482b(android.content.Context r2) {
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.C0498r.m1549a(r2, r0, r0)
            int r0 = androidx.mediarouter.app.C0498r.m1550b(r2)
            r1.<init>(r2, r0)
            f1.n r2 = p085f1.C1973n.f8666c
            r1.f2646d0 = r2
            androidx.mediarouter.app.b$a r2 = new androidx.mediarouter.app.b$a
            r2.<init>(r1)
            r1.f2652j0 = r2
            android.content.Context r2 = r1.getContext()
            f1.o r2 = p085f1.C1974o.m5026d(r2)
            r1.f2643a0 = r2
            androidx.mediarouter.app.b$b r2 = new androidx.mediarouter.app.b$b
            r2.<init>(r1)
            r1.f2644b0 = r2
            return
    }

    /* renamed from: d */
    public void m1493d() {
            r7 = this;
            boolean r0 = r7.f2650h0
            if (r0 == 0) goto L72
            java.util.ArrayList r0 = new java.util.ArrayList
            f1.o r1 = r7.f2643a0
            java.util.List r1 = r1.m5030f()
            r0.<init>(r1)
            int r1 = r0.size()
        L13:
            int r2 = r1 + (-1)
            r3 = 1
            if (r1 <= 0) goto L39
            java.lang.Object r1 = r0.get(r2)
            f1.o$i r1 = (p085f1.C1974o.i) r1
            boolean r4 = r1.m5066e()
            if (r4 != 0) goto L31
            boolean r4 = r1.f8739g
            if (r4 == 0) goto L31
            f1.n r4 = r7.f2646d0
            boolean r1 = r1.m5070i(r4)
            if (r1 == 0) goto L31
            goto L32
        L31:
            r3 = 0
        L32:
            if (r3 != 0) goto L37
            r0.remove(r2)
        L37:
            r1 = r2
            goto L13
        L39:
            androidx.mediarouter.app.b$d r1 = androidx.mediarouter.app.DialogC0482b.d.f2660Y
            java.util.Collections.sort(r0, r1)
            long r1 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.f2651i0
            long r1 = r1 - r4
            r4 = 300(0x12c, double:1.48E-321)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L61
            long r1 = android.os.SystemClock.uptimeMillis()
            r7.f2651i0 = r1
            java.util.ArrayList<f1.o$i> r1 = r7.f2647e0
            r1.clear()
            java.util.ArrayList<f1.o$i> r1 = r7.f2647e0
            r1.addAll(r0)
            androidx.mediarouter.app.b$c r0 = r7.f2648f0
            r0.notifyDataSetChanged()
            goto L72
        L61:
            android.os.Handler r1 = r7.f2652j0
            r1.removeMessages(r3)
            android.os.Handler r1 = r7.f2652j0
            android.os.Message r0 = r1.obtainMessage(r3, r0)
            long r2 = r7.f2651i0
            long r2 = r2 + r4
            r1.sendMessageAtTime(r0, r2)
        L72:
            return
    }

    /* renamed from: e */
    public void m1494e(p085f1.C1973n r4) {
            r3 = this;
            if (r4 == 0) goto L23
            f1.n r0 = r3.f2646d0
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L22
            r3.f2646d0 = r4
            boolean r0 = r3.f2650h0
            if (r0 == 0) goto L1f
            f1.o r0 = r3.f2643a0
            androidx.mediarouter.app.b$b r1 = r3.f2644b0
            r0.m5033i(r1)
            f1.o r0 = r3.f2643a0
            androidx.mediarouter.app.b$b r1 = r3.f2644b0
            r2 = 1
            r0.m5027a(r4, r1, r2)
        L1f:
            r3.m1493d()
        L22:
            return
        L23:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "selector must not be null"
            r4.<init>(r0)
            throw r4
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            r0 = 1
            r4.f2650h0 = r0
            f1.o r1 = r4.f2643a0
            f1.n r2 = r4.f2646d0
            androidx.mediarouter.app.b$b r3 = r4.f2644b0
            r1.m5027a(r2, r3, r0)
            r4.m1493d()
            return
    }

    @Override // p083f.DialogC1929p, android.app.Dialog
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            r3 = 2131558512(0x7f0d0070, float:1.8742342E38)
            r2.setContentView(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f2647e0 = r3
            androidx.mediarouter.app.b$c r3 = new androidx.mediarouter.app.b$c
            android.content.Context r0 = r2.getContext()
            java.util.ArrayList<f1.o$i> r1 = r2.f2647e0
            r3.<init>(r0, r1)
            r2.f2648f0 = r3
            r3 = 2131362382(0x7f0a024e, float:1.8344543E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ListView r3 = (android.widget.ListView) r3
            r2.f2649g0 = r3
            androidx.mediarouter.app.b$c r0 = r2.f2648f0
            r3.setAdapter(r0)
            android.widget.ListView r3 = r2.f2649g0
            androidx.mediarouter.app.b$c r0 = r2.f2648f0
            r3.setOnItemClickListener(r0)
            android.widget.ListView r3 = r2.f2649g0
            r0 = 16908292(0x1020004, float:2.387724E-38)
            android.view.View r0 = r2.findViewById(r0)
            r3.setEmptyView(r0)
            r3 = 2131362387(0x7f0a0253, float:1.8344553E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f2645c0 = r3
            android.view.Window r3 = r2.getWindow()
            android.content.Context r0 = r2.getContext()
            int r0 = androidx.mediarouter.app.C0492l.m1516a(r0)
            r1 = -2
            r3.setLayout(r0, r1)
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
            r2 = this;
            r0 = 0
            r2.f2650h0 = r0
            f1.o r0 = r2.f2643a0
            androidx.mediarouter.app.b$b r1 = r2.f2644b0
            r0.m5033i(r1)
            android.os.Handler r0 = r2.f2652j0
            r1 = 1
            r0.removeMessages(r1)
            super.onDetachedFromWindow()
            return
    }

    @Override // p083f.DialogC1929p, android.app.Dialog
    public void setTitle(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f2645c0
            r0.setText(r2)
            return
    }

    @Override // p083f.DialogC1929p, android.app.Dialog
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f2645c0
            r0.setText(r2)
            return
    }
}
