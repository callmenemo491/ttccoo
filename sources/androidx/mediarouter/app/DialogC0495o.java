package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.o */
/* loaded from: classes.dex */
public class DialogC0495o extends p083f.DialogC1929p {

    /* renamed from: N0 */
    public static final boolean f2793N0 = false;

    /* renamed from: A0 */
    public android.widget.ImageView f2794A0;

    /* renamed from: B0 */
    public android.widget.TextView f2795B0;

    /* renamed from: C0 */
    public android.widget.TextView f2796C0;

    /* renamed from: D0 */
    public java.lang.String f2797D0;

    /* renamed from: E0 */
    public android.support.v4.media.session.MediaControllerCompat f2798E0;

    /* renamed from: F0 */
    public androidx.mediarouter.app.DialogC0495o.e f2799F0;

    /* renamed from: G0 */
    public android.support.v4.media.MediaDescriptionCompat f2800G0;

    /* renamed from: H0 */
    public androidx.mediarouter.app.DialogC0495o.d f2801H0;

    /* renamed from: I0 */
    public android.graphics.Bitmap f2802I0;

    /* renamed from: J0 */
    public android.net.Uri f2803J0;

    /* renamed from: K0 */
    public boolean f2804K0;

    /* renamed from: L0 */
    public android.graphics.Bitmap f2805L0;

    /* renamed from: M0 */
    public int f2806M0;

    /* renamed from: a0 */
    public final p085f1.C1974o f2807a0;

    /* renamed from: b0 */
    public final androidx.mediarouter.app.DialogC0495o.g f2808b0;

    /* renamed from: c0 */
    public p085f1.C1973n f2809c0;

    /* renamed from: d0 */
    public p085f1.C1974o.i f2810d0;

    /* renamed from: e0 */
    public final java.util.List<p085f1.C1974o.i> f2811e0;

    /* renamed from: f0 */
    public final java.util.List<p085f1.C1974o.i> f2812f0;

    /* renamed from: g0 */
    public final java.util.List<p085f1.C1974o.i> f2813g0;

    /* renamed from: h0 */
    public final java.util.List<p085f1.C1974o.i> f2814h0;

    /* renamed from: i0 */
    public android.content.Context f2815i0;

    /* renamed from: j0 */
    public boolean f2816j0;

    /* renamed from: k0 */
    public boolean f2817k0;

    /* renamed from: l0 */
    public long f2818l0;

    /* renamed from: m0 */
    public final android.os.Handler f2819m0;

    /* renamed from: n0 */
    public androidx.recyclerview.widget.RecyclerView f2820n0;

    /* renamed from: o0 */
    public androidx.mediarouter.app.DialogC0495o.h f2821o0;

    /* renamed from: p0 */
    public androidx.mediarouter.app.DialogC0495o.j f2822p0;

    /* renamed from: q0 */
    public java.util.Map<java.lang.String, androidx.mediarouter.app.DialogC0495o.f> f2823q0;

    /* renamed from: r0 */
    public p085f1.C1974o.i f2824r0;

    /* renamed from: s0 */
    public java.util.Map<java.lang.String, java.lang.Integer> f2825s0;

    /* renamed from: t0 */
    public boolean f2826t0;

    /* renamed from: u0 */
    public boolean f2827u0;

    /* renamed from: v0 */
    public boolean f2828v0;

    /* renamed from: w0 */
    public android.widget.ImageButton f2829w0;

    /* renamed from: x0 */
    public android.widget.Button f2830x0;

    /* renamed from: y0 */
    public android.widget.ImageView f2831y0;

    /* renamed from: z0 */
    public android.view.View f2832z0;

    /* renamed from: androidx.mediarouter.app.o$a */
    public class a extends android.os.Handler {

        /* renamed from: a */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0495o f2833a;

        public a(androidx.mediarouter.app.DialogC0495o r1) {
                r0 = this;
                r0.f2833a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r2) {
                r1 = this;
                int r2 = r2.what
                r0 = 1
                if (r2 == r0) goto L16
                r0 = 2
                if (r2 == r0) goto L9
                goto L1b
            L9:
                androidx.mediarouter.app.o r2 = r1.f2833a
                f1.o$i r0 = r2.f2824r0
                if (r0 == 0) goto L1b
                r0 = 0
                r2.f2824r0 = r0
                r2.m1537r()
                goto L1b
            L16:
                androidx.mediarouter.app.o r2 = r1.f2833a
                r2.m1536q()
            L1b:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.o$b */
    public class b implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0495o f2834Y;

        public b(androidx.mediarouter.app.DialogC0495o r1) {
                r0 = this;
                r0.f2834Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                androidx.mediarouter.app.o r1 = r0.f2834Y
                r1.dismiss()
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.o$c */
    public class c implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0495o f2835Y;

        public c(androidx.mediarouter.app.DialogC0495o r1) {
                r0 = this;
                r0.f2835Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                androidx.mediarouter.app.o r2 = r1.f2835Y
                f1.o$i r2 = r2.f2810d0
                boolean r2 = r2.m5069h()
                if (r2 == 0) goto L12
                androidx.mediarouter.app.o r2 = r1.f2835Y
                f1.o r2 = r2.f2807a0
                r0 = 2
                r2.m5035k(r0)
            L12:
                androidx.mediarouter.app.o r2 = r1.f2835Y
                r2.dismiss()
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.o$d */
    public class d extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.graphics.Bitmap> {

        /* renamed from: a */
        public final android.graphics.Bitmap f2836a;

        /* renamed from: b */
        public final android.net.Uri f2837b;

        /* renamed from: c */
        public int f2838c;

        /* renamed from: d */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0495o f2839d;

        public d(androidx.mediarouter.app.DialogC0495o r4) {
                r3 = this;
                r3.f2839d = r4
                r3.<init>()
                android.support.v4.media.MediaDescriptionCompat r0 = r4.f2800G0
                r1 = 0
                if (r0 != 0) goto Lc
                r0 = r1
                goto Le
            Lc:
                android.graphics.Bitmap r0 = r0.f489c0
            Le:
                boolean r2 = androidx.mediarouter.app.DialogC0495o.m1526d(r0)
                if (r2 == 0) goto L1c
                java.lang.String r0 = "MediaRouteCtrlDialog"
                java.lang.String r2 = "Can't fetch the given art bitmap because it's already recycled."
                android.util.Log.w(r0, r2)
                r0 = r1
            L1c:
                r3.f2836a = r0
                android.support.v4.media.MediaDescriptionCompat r4 = r4.f2800G0
                if (r4 != 0) goto L23
                goto L25
            L23:
                android.net.Uri r1 = r4.f490d0
            L25:
                r3.f2837b = r1
                return
        }

        /* renamed from: a */
        public final java.io.InputStream m1538a(android.net.Uri r3) {
                r2 = this;
                java.lang.String r0 = r3.getScheme()
                java.lang.String r0 = r0.toLowerCase()
                java.lang.String r1 = "android.resource"
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L3b
                java.lang.String r1 = "content"
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L3b
                java.lang.String r1 = "file"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L21
                goto L3b
            L21:
                java.net.URL r0 = new java.net.URL
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                java.net.URLConnection r3 = r0.openConnection()
                r0 = 30000(0x7530, float:4.2039E-41)
                r3.setConnectTimeout(r0)
                r3.setReadTimeout(r0)
                java.io.InputStream r3 = r3.getInputStream()
                goto L47
            L3b:
                androidx.mediarouter.app.o r0 = r2.f2839d
                android.content.Context r0 = r0.f2815i0
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.io.InputStream r3 = r0.openInputStream(r3)
            L47:
                if (r3 != 0) goto L4b
                r3 = 0
                goto L51
            L4b:
                java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
                r0.<init>(r3)
                r3 = r0
            L51:
                return r3
        }

        @Override // android.os.AsyncTask
        public android.graphics.Bitmap doInBackground(java.lang.Void[] r9) {
                r8 = this;
                java.lang.Void[] r9 = (java.lang.Void[]) r9
                java.lang.String r9 = "Unable to open: "
                android.graphics.Bitmap r0 = r8.f2836a
                r1 = 0
                r2 = 1
                java.lang.String r3 = "MediaRouteCtrlDialog"
                r4 = 0
                if (r0 == 0) goto Lf
                goto Lc5
            Lf:
                android.net.Uri r0 = r8.f2837b
                if (r0 == 0) goto Lc4
                java.io.InputStream r0 = r8.m1538a(r0)     // Catch: java.lang.Throwable -> La0 java.io.IOException -> La2
                if (r0 != 0) goto L34
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                r5.<init>()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                r5.append(r9)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                android.net.Uri r6 = r8.f2837b     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                r5.append(r6)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                android.util.Log.w(r3, r5)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                if (r0 == 0) goto L111
            L2f:
                r0.close()     // Catch: java.io.IOException -> L111
                goto L111
            L34:
                android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                r5.<init>()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                r5.inJustDecodeBounds = r2     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                int r6 = r5.outWidth     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                if (r6 == 0) goto L2f
                int r6 = r5.outHeight     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                if (r6 != 0) goto L47
                goto L2f
            L47:
                r0.reset()     // Catch: java.io.IOException -> L4b java.lang.Throwable -> L9b
                goto L6d
            L4b:
                r0.close()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                android.net.Uri r6 = r8.f2837b     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                java.io.InputStream r0 = r8.m1538a(r6)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                if (r0 != 0) goto L6d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                r5.<init>()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                r5.append(r9)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                android.net.Uri r6 = r8.f2837b     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                r5.append(r6)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                android.util.Log.w(r3, r5)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                if (r0 == 0) goto L111
                goto L2f
            L6d:
                r5.inJustDecodeBounds = r1     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                androidx.mediarouter.app.o r6 = r8.f2839d     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                android.content.Context r6 = r6.f2815i0     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                r7 = 2131165452(0x7f07010c, float:1.7945122E38)
                int r6 = r6.getDimensionPixelSize(r7)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                int r7 = r5.outHeight     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                int r7 = r7 / r6
                int r6 = java.lang.Integer.highestOneBit(r7)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                int r6 = java.lang.Math.max(r2, r6)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                r5.inSampleSize = r6     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                boolean r6 = r8.isCancelled()     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                if (r6 == 0) goto L92
                goto L2f
            L92:
                android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9e
                r0.close()     // Catch: java.io.IOException -> L99
            L99:
                r0 = r9
                goto Lc5
            L9b:
                r9 = move-exception
                r4 = r0
                goto Lbe
            L9e:
                r5 = move-exception
                goto La4
            La0:
                r9 = move-exception
                goto Lbe
            La2:
                r5 = move-exception
                r0 = r4
            La4:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
                r6.<init>()     // Catch: java.lang.Throwable -> L9b
                r6.append(r9)     // Catch: java.lang.Throwable -> L9b
                android.net.Uri r9 = r8.f2837b     // Catch: java.lang.Throwable -> L9b
                r6.append(r9)     // Catch: java.lang.Throwable -> L9b
                java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L9b
                android.util.Log.w(r3, r9, r5)     // Catch: java.lang.Throwable -> L9b
                if (r0 == 0) goto Lc4
                r0.close()     // Catch: java.io.IOException -> Lc4
                goto Lc4
            Lbe:
                if (r4 == 0) goto Lc3
                r4.close()     // Catch: java.io.IOException -> Lc3
            Lc3:
                throw r9
            Lc4:
                r0 = r4
            Lc5:
                boolean r9 = androidx.mediarouter.app.DialogC0495o.m1526d(r0)
                if (r9 == 0) goto Le0
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = "Can't use recycled bitmap: "
                r9.append(r1)
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                android.util.Log.w(r3, r9)
                goto L111
            Le0:
                if (r0 == 0) goto L110
                int r9 = r0.getWidth()
                int r3 = r0.getHeight()
                if (r9 >= r3) goto L110
                h1.b$b r9 = new h1.b$b
                r9.<init>(r0)
                r9.f10894c = r2
                h1.b r9 = r9.m6184a()
                java.util.List r2 = r9.m6182a()
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L102
                goto L10e
            L102:
                java.util.List r9 = r9.m6182a()
                java.lang.Object r9 = r9.get(r1)
                h1.b$d r9 = (p118h1.C2437b.d) r9
                int r1 = r9.f10901d
            L10e:
                r8.f2838c = r1
            L110:
                r4 = r0
            L111:
                return r4
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(android.graphics.Bitmap r3) {
                r2 = this;
                android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
                androidx.mediarouter.app.o r0 = r2.f2839d
                r1 = 0
                r0.f2801H0 = r1
                android.graphics.Bitmap r0 = r0.f2802I0
                android.graphics.Bitmap r1 = r2.f2836a
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 == 0) goto L1d
                androidx.mediarouter.app.o r0 = r2.f2839d
                android.net.Uri r0 = r0.f2803J0
                android.net.Uri r1 = r2.f2837b
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 != 0) goto L33
            L1d:
                androidx.mediarouter.app.o r0 = r2.f2839d
                android.graphics.Bitmap r1 = r2.f2836a
                r0.f2802I0 = r1
                r0.f2805L0 = r3
                android.net.Uri r3 = r2.f2837b
                r0.f2803J0 = r3
                int r3 = r2.f2838c
                r0.f2806M0 = r3
                r3 = 1
                r0.f2804K0 = r3
                r0.m1534o()
            L33:
                return
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
                r3 = this;
                androidx.mediarouter.app.o r0 = r3.f2839d
                r1 = 0
                r0.f2804K0 = r1
                r2 = 0
                r0.f2805L0 = r2
                r0.f2806M0 = r1
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.o$e */
    public final class e extends android.support.v4.media.session.MediaControllerCompat.AbstractC0148a {

        /* renamed from: d */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0495o f2840d;

        public e(androidx.mediarouter.app.DialogC0495o r1) {
                r0 = this;
                r0.f2840d = r1
                r0.<init>()
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0148a
        /* renamed from: a */
        public void mo272a(android.support.v4.media.MediaMetadataCompat r2) {
                r1 = this;
                androidx.mediarouter.app.o r0 = r1.f2840d
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                android.support.v4.media.MediaDescriptionCompat r2 = r2.m230d()
            La:
                r0.f2800G0 = r2
                androidx.mediarouter.app.o r2 = r1.f2840d
                r2.m1529f()
                androidx.mediarouter.app.o r2 = r1.f2840d
                r2.m1534o()
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0148a
        /* renamed from: d */
        public void mo275d() {
                r2 = this;
                androidx.mediarouter.app.o r0 = r2.f2840d
                android.support.v4.media.session.MediaControllerCompat r1 = r0.f2798E0
                if (r1 == 0) goto L10
                androidx.mediarouter.app.o$e r0 = r0.f2799F0
                r1.m263e(r0)
                androidx.mediarouter.app.o r0 = r2.f2840d
                r1 = 0
                r0.f2798E0 = r1
            L10:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.o$f */
    public abstract class f extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public p085f1.C1974o.i f2841u;

        /* renamed from: v */
        public final android.widget.ImageButton f2842v;

        /* renamed from: w */
        public final androidx.mediarouter.app.MediaRouteVolumeSlider f2843w;

        /* renamed from: x */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0495o f2844x;

        /* renamed from: androidx.mediarouter.app.o$f$a */
        public class a implements android.view.View.OnClickListener {

            /* renamed from: Y */
            public final /* synthetic */ androidx.mediarouter.app.DialogC0495o.f f2845Y;

            public a(androidx.mediarouter.app.DialogC0495o.f r1) {
                    r0 = this;
                    r0.f2845Y = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r5) {
                    r4 = this;
                    androidx.mediarouter.app.o$f r0 = r4.f2845Y
                    androidx.mediarouter.app.o r0 = r0.f2844x
                    f1.o$i r1 = r0.f2824r0
                    r2 = 2
                    if (r1 == 0) goto Le
                    android.os.Handler r0 = r0.f2819m0
                    r0.removeMessages(r2)
                Le:
                    androidx.mediarouter.app.o$f r0 = r4.f2845Y
                    androidx.mediarouter.app.o r1 = r0.f2844x
                    f1.o$i r0 = r0.f2841u
                    r1.f2824r0 = r0
                    boolean r5 = r5.isActivated()
                    r0 = 1
                    r5 = r5 ^ r0
                    if (r5 == 0) goto L20
                    r0 = 0
                    goto L3b
                L20:
                    androidx.mediarouter.app.o$f r1 = r4.f2845Y
                    androidx.mediarouter.app.o r3 = r1.f2844x
                    java.util.Map<java.lang.String, java.lang.Integer> r3 = r3.f2825s0
                    f1.o$i r1 = r1.f2841u
                    java.lang.String r1 = r1.f8735c
                    java.lang.Object r1 = r3.get(r1)
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    if (r1 != 0) goto L33
                    goto L3b
                L33:
                    int r1 = r1.intValue()
                    int r0 = java.lang.Math.max(r0, r1)
                L3b:
                    androidx.mediarouter.app.o$f r1 = r4.f2845Y
                    r1.m1540y(r5)
                    androidx.mediarouter.app.o$f r5 = r4.f2845Y
                    androidx.mediarouter.app.MediaRouteVolumeSlider r5 = r5.f2843w
                    r5.setProgress(r0)
                    androidx.mediarouter.app.o$f r5 = r4.f2845Y
                    f1.o$i r5 = r5.f2841u
                    r5.m5072k(r0)
                    androidx.mediarouter.app.o$f r5 = r4.f2845Y
                    androidx.mediarouter.app.o r5 = r5.f2844x
                    android.os.Handler r5 = r5.f2819m0
                    r0 = 500(0x1f4, double:2.47E-321)
                    r5.sendEmptyMessageDelayed(r2, r0)
                    return
            }
        }

        public f(androidx.mediarouter.app.DialogC0495o r2, android.view.View r3, android.widget.ImageButton r4, androidx.mediarouter.app.MediaRouteVolumeSlider r5) {
                r1 = this;
                r1.f2844x = r2
                r1.<init>(r3)
                r1.f2842v = r4
                r1.f2843w = r5
                android.content.Context r3 = r2.f2815i0
                r0 = 2131231307(0x7f08024b, float:1.8078691E38)
                android.graphics.drawable.Drawable r3 = androidx.mediarouter.app.C0498r.m1554f(r3, r0)
                r4.setImageDrawable(r3)
                android.content.Context r2 = r2.f2815i0
                boolean r3 = androidx.mediarouter.app.C0498r.m1558j(r2)
                if (r3 == 0) goto L28
                r3 = 2131099858(0x7f0600d2, float:1.7812081E38)
                int r3 = p046d0.C1259a.m3706b(r2, r3)
                r4 = 2131099856(0x7f0600d0, float:1.7812077E38)
                goto L32
            L28:
                r3 = 2131099857(0x7f0600d1, float:1.781208E38)
                int r3 = p046d0.C1259a.m3706b(r2, r3)
                r4 = 2131099855(0x7f0600cf, float:1.7812075E38)
            L32:
                int r2 = p046d0.C1259a.m3706b(r2, r4)
                r5.m1476a(r3, r2)
                return
        }

        /* renamed from: x */
        public void m1539x(p085f1.C1974o.i r4) {
                r3 = this;
                r3.f2841u = r4
                int r0 = r4.f8747o
                if (r0 != 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                android.widget.ImageButton r2 = r3.f2842v
                r2.setActivated(r1)
                android.widget.ImageButton r1 = r3.f2842v
                androidx.mediarouter.app.o$f$a r2 = new androidx.mediarouter.app.o$f$a
                r2.<init>(r3)
                r1.setOnClickListener(r2)
                androidx.mediarouter.app.MediaRouteVolumeSlider r1 = r3.f2843w
                f1.o$i r2 = r3.f2841u
                r1.setTag(r2)
                androidx.mediarouter.app.MediaRouteVolumeSlider r1 = r3.f2843w
                int r4 = r4.f8748p
                r1.setMax(r4)
                androidx.mediarouter.app.MediaRouteVolumeSlider r4 = r3.f2843w
                r4.setProgress(r0)
                androidx.mediarouter.app.MediaRouteVolumeSlider r4 = r3.f2843w
                androidx.mediarouter.app.o r0 = r3.f2844x
                androidx.mediarouter.app.o$j r0 = r0.f2822p0
                r4.setOnSeekBarChangeListener(r0)
                return
        }

        /* renamed from: y */
        public void m1540y(boolean r3) {
                r2 = this;
                android.widget.ImageButton r0 = r2.f2842v
                boolean r0 = r0.isActivated()
                if (r0 != r3) goto L9
                return
            L9:
                android.widget.ImageButton r0 = r2.f2842v
                r0.setActivated(r3)
                if (r3 == 0) goto L26
                androidx.mediarouter.app.o r3 = r2.f2844x
                java.util.Map<java.lang.String, java.lang.Integer> r3 = r3.f2825s0
                f1.o$i r0 = r2.f2841u
                java.lang.String r0 = r0.f8735c
                androidx.mediarouter.app.MediaRouteVolumeSlider r1 = r2.f2843w
                int r1 = r1.getProgress()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3.put(r0, r1)
                goto L31
            L26:
                androidx.mediarouter.app.o r3 = r2.f2844x
                java.util.Map<java.lang.String, java.lang.Integer> r3 = r3.f2825s0
                f1.o$i r0 = r2.f2841u
                java.lang.String r0 = r0.f8735c
                r3.remove(r0)
            L31:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.o$g */
    public final class g extends p085f1.C1974o.b {

        /* renamed from: a */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0495o f2846a;

        public g(androidx.mediarouter.app.DialogC0495o r1) {
                r0 = this;
                r0.f2846a = r1
                r0.<init>()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: d */
        public void mo1488d(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.o r1 = r0.f2846a
                r1.m1536q()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: e */
        public void mo1489e(p085f1.C1974o r2, p085f1.C1974o.i r3) {
                r1 = this;
                androidx.mediarouter.app.o r2 = r1.f2846a
                f1.o$i r2 = r2.f2810d0
                if (r3 != r2) goto L4d
                f1.i$b r2 = r3.m5062a()
                if (r2 == 0) goto L4d
                f1.o$h r2 = r3.f8733a
                java.util.List r2 = r2.m5061b()
                java.util.Iterator r2 = r2.iterator()
            L16:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4d
                java.lang.Object r3 = r2.next()
                f1.o$i r3 = (p085f1.C1974o.i) r3
                androidx.mediarouter.app.o r0 = r1.f2846a
                f1.o$i r0 = r0.f2810d0
                java.util.List r0 = r0.m5064c()
                boolean r0 = r0.contains(r3)
                if (r0 == 0) goto L31
                goto L16
            L31:
                androidx.mediarouter.app.o r0 = r1.f2846a
                f1.o$i r0 = r0.f2810d0
                f1.o$i$a r0 = r0.m5063b(r3)
                if (r0 == 0) goto L16
                boolean r0 = r0.m5077a()
                if (r0 == 0) goto L16
                androidx.mediarouter.app.o r0 = r1.f2846a
                java.util.List<f1.o$i> r0 = r0.f2812f0
                boolean r3 = r0.contains(r3)
                if (r3 != 0) goto L16
                r2 = 1
                goto L4e
            L4d:
                r2 = 0
            L4e:
                if (r2 == 0) goto L5b
                androidx.mediarouter.app.o r2 = r1.f2846a
                r2.m1537r()
                androidx.mediarouter.app.o r2 = r1.f2846a
                r2.m1535p()
                goto L60
            L5b:
                androidx.mediarouter.app.o r2 = r1.f2846a
                r2.m1536q()
            L60:
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: f */
        public void mo1490f(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.o r1 = r0.f2846a
                r1.m1536q()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: g */
        public void mo1491g(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.o r1 = r0.f2846a
                r1.f2810d0 = r2
                r1.m1537r()
                androidx.mediarouter.app.o r1 = r0.f2846a
                r1.m1535p()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: i */
        public void mo1492i(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.o r1 = r0.f2846a
                r1.m1536q()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: k */
        public void mo1515k(p085f1.C1974o r3, p085f1.C1974o.i r4) {
                r2 = this;
                int r3 = r4.f8747o
                boolean r0 = androidx.mediarouter.app.DialogC0495o.f2793N0
                if (r0 == 0) goto L1c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onRouteVolumeChanged(), route.getVolume:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "MediaRouteCtrlDialog"
                android.util.Log.d(r0, r3)
            L1c:
                androidx.mediarouter.app.o r3 = r2.f2846a
                f1.o$i r0 = r3.f2824r0
                if (r0 == r4) goto L3f
                java.util.Map<java.lang.String, androidx.mediarouter.app.o$f> r3 = r3.f2823q0
                java.lang.String r4 = r4.f8735c
                java.lang.Object r3 = r3.get(r4)
                androidx.mediarouter.app.o$f r3 = (androidx.mediarouter.app.DialogC0495o.f) r3
                if (r3 == 0) goto L3f
                f1.o$i r4 = r3.f2841u
                int r4 = r4.f8747o
                if (r4 != 0) goto L36
                r0 = 1
                goto L37
            L36:
                r0 = 0
            L37:
                r3.m1540y(r0)
                androidx.mediarouter.app.MediaRouteVolumeSlider r3 = r3.f2843w
                r3.setProgress(r4)
            L3f:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.o$h */
    public final class h extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> {

        /* renamed from: d */
        public final java.util.ArrayList<androidx.mediarouter.app.DialogC0495o.h.f> f2847d;

        /* renamed from: e */
        public final android.view.LayoutInflater f2848e;

        /* renamed from: f */
        public final android.graphics.drawable.Drawable f2849f;

        /* renamed from: g */
        public final android.graphics.drawable.Drawable f2850g;

        /* renamed from: h */
        public final android.graphics.drawable.Drawable f2851h;

        /* renamed from: i */
        public final android.graphics.drawable.Drawable f2852i;

        /* renamed from: j */
        public androidx.mediarouter.app.DialogC0495o.h.f f2853j;

        /* renamed from: k */
        public final int f2854k;

        /* renamed from: l */
        public final android.view.animation.Interpolator f2855l;

        /* renamed from: m */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0495o f2856m;

        /* renamed from: androidx.mediarouter.app.o$h$a */
        public class a extends android.view.animation.Animation {

            /* renamed from: Y */
            public final /* synthetic */ int f2857Y;

            /* renamed from: Z */
            public final /* synthetic */ int f2858Z;

            /* renamed from: a0 */
            public final /* synthetic */ android.view.View f2859a0;

            public a(androidx.mediarouter.app.DialogC0495o.h r1, int r2, int r3, android.view.View r4) {
                    r0 = this;
                    r0.f2857Y = r2
                    r0.f2858Z = r3
                    r0.f2859a0 = r4
                    r0.<init>()
                    return
            }

            @Override // android.view.animation.Animation
            public void applyTransformation(float r2, android.view.animation.Transformation r3) {
                    r1 = this;
                    int r3 = r1.f2857Y
                    int r0 = r1.f2858Z
                    int r3 = r3 - r0
                    float r3 = (float) r3
                    float r3 = r3 * r2
                    int r2 = (int) r3
                    android.view.View r3 = r1.f2859a0
                    int r0 = r0 + r2
                    androidx.mediarouter.app.DialogC0495o.m1527g(r3, r0)
                    return
            }
        }

        /* renamed from: androidx.mediarouter.app.o$h$b */
        public class b implements android.view.animation.Animation.AnimationListener {

            /* renamed from: a */
            public final /* synthetic */ androidx.mediarouter.app.DialogC0495o.h f2860a;

            public b(androidx.mediarouter.app.DialogC0495o.h r1) {
                    r0 = this;
                    r0.f2860a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation r2) {
                    r1 = this;
                    androidx.mediarouter.app.o$h r2 = r1.f2860a
                    androidx.mediarouter.app.o r2 = r2.f2856m
                    r0 = 0
                    r2.f2826t0 = r0
                    r2.m1537r()
                    return
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation r1) {
                    r0 = this;
                    return
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation r2) {
                    r1 = this;
                    androidx.mediarouter.app.o$h r2 = r1.f2860a
                    androidx.mediarouter.app.o r2 = r2.f2856m
                    r0 = 1
                    r2.f2826t0 = r0
                    return
            }
        }

        /* renamed from: androidx.mediarouter.app.o$h$c */
        public class c extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

            /* renamed from: A */
            public final /* synthetic */ androidx.mediarouter.app.DialogC0495o.h f2861A;

            /* renamed from: u */
            public final android.view.View f2862u;

            /* renamed from: v */
            public final android.widget.ImageView f2863v;

            /* renamed from: w */
            public final android.widget.ProgressBar f2864w;

            /* renamed from: x */
            public final android.widget.TextView f2865x;

            /* renamed from: y */
            public final float f2866y;

            /* renamed from: z */
            public p085f1.C1974o.i f2867z;

            public c(androidx.mediarouter.app.DialogC0495o.h r3, android.view.View r4) {
                    r2 = this;
                    r2.f2861A = r3
                    r2.<init>(r4)
                    r2.f2862u = r4
                    r0 = 2131362365(0x7f0a023d, float:1.8344509E38)
                    android.view.View r0 = r4.findViewById(r0)
                    android.widget.ImageView r0 = (android.widget.ImageView) r0
                    r2.f2863v = r0
                    r0 = 2131362367(0x7f0a023f, float:1.8344513E38)
                    android.view.View r0 = r4.findViewById(r0)
                    android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                    r2.f2864w = r0
                    r1 = 2131362366(0x7f0a023e, float:1.834451E38)
                    android.view.View r4 = r4.findViewById(r1)
                    android.widget.TextView r4 = (android.widget.TextView) r4
                    r2.f2865x = r4
                    androidx.mediarouter.app.o r4 = r3.f2856m
                    android.content.Context r4 = r4.f2815i0
                    float r4 = androidx.mediarouter.app.C0498r.m1552d(r4)
                    r2.f2866y = r4
                    androidx.mediarouter.app.o r3 = r3.f2856m
                    android.content.Context r3 = r3.f2815i0
                    androidx.mediarouter.app.C0498r.m1560l(r3, r0)
                    return
            }
        }

        /* renamed from: androidx.mediarouter.app.o$h$d */
        public class d extends androidx.mediarouter.app.DialogC0495o.f {

            /* renamed from: A */
            public final /* synthetic */ androidx.mediarouter.app.DialogC0495o.h f2868A;

            /* renamed from: y */
            public final android.widget.TextView f2869y;

            /* renamed from: z */
            public final int f2870z;

            public d(androidx.mediarouter.app.DialogC0495o.h r4, android.view.View r5) {
                    r3 = this;
                    r3.f2868A = r4
                    androidx.mediarouter.app.o r0 = r4.f2856m
                    r1 = 2131362375(0x7f0a0247, float:1.8344529E38)
                    android.view.View r1 = r5.findViewById(r1)
                    android.widget.ImageButton r1 = (android.widget.ImageButton) r1
                    r2 = 2131362381(0x7f0a024d, float:1.834454E38)
                    android.view.View r2 = r5.findViewById(r2)
                    androidx.mediarouter.app.MediaRouteVolumeSlider r2 = (androidx.mediarouter.app.MediaRouteVolumeSlider) r2
                    r3.<init>(r0, r5, r1, r2)
                    r0 = 2131362399(0x7f0a025f, float:1.8344577E38)
                    android.view.View r5 = r5.findViewById(r0)
                    android.widget.TextView r5 = (android.widget.TextView) r5
                    r3.f2869y = r5
                    androidx.mediarouter.app.o r4 = r4.f2856m
                    android.content.Context r4 = r4.f2815i0
                    android.content.res.Resources r4 = r4.getResources()
                    android.util.DisplayMetrics r5 = r4.getDisplayMetrics()
                    android.util.TypedValue r0 = new android.util.TypedValue
                    r0.<init>()
                    r1 = 2131165465(0x7f070119, float:1.7945148E38)
                    r2 = 1
                    r4.getValue(r1, r0, r2)
                    float r4 = r0.getDimension(r5)
                    int r4 = (int) r4
                    r3.f2870z = r4
                    return
            }
        }

        /* renamed from: androidx.mediarouter.app.o$h$e */
        public class e extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

            /* renamed from: u */
            public final android.widget.TextView f2871u;

            public e(androidx.mediarouter.app.DialogC0495o.h r1, android.view.View r2) {
                    r0 = this;
                    r0.<init>(r2)
                    r1 = 2131362368(0x7f0a0240, float:1.8344515E38)
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.f2871u = r1
                    return
            }
        }

        /* renamed from: androidx.mediarouter.app.o$h$f */
        public class f {

            /* renamed from: a */
            public final java.lang.Object f2872a;

            /* renamed from: b */
            public final int f2873b;

            public f(androidx.mediarouter.app.DialogC0495o.h r1, java.lang.Object r2, int r3) {
                    r0 = this;
                    r0.<init>()
                    r0.f2872a = r2
                    r0.f2873b = r3
                    return
            }
        }

        /* renamed from: androidx.mediarouter.app.o$h$g */
        public class g extends androidx.mediarouter.app.DialogC0495o.f {

            /* renamed from: A */
            public final android.widget.ProgressBar f2874A;

            /* renamed from: B */
            public final android.widget.TextView f2875B;

            /* renamed from: C */
            public final android.widget.RelativeLayout f2876C;

            /* renamed from: D */
            public final android.widget.CheckBox f2877D;

            /* renamed from: E */
            public final float f2878E;

            /* renamed from: F */
            public final int f2879F;

            /* renamed from: G */
            public final android.view.View.OnClickListener f2880G;

            /* renamed from: H */
            public final /* synthetic */ androidx.mediarouter.app.DialogC0495o.h f2881H;

            /* renamed from: y */
            public final android.view.View f2882y;

            /* renamed from: z */
            public final android.widget.ImageView f2883z;

            /* renamed from: androidx.mediarouter.app.o$h$g$a */
            public class a implements android.view.View.OnClickListener {

                /* renamed from: Y */
                public final /* synthetic */ androidx.mediarouter.app.DialogC0495o.h.g f2884Y;

                public a(androidx.mediarouter.app.DialogC0495o.h.g r1) {
                        r0 = this;
                        r0.f2884Y = r1
                        r0.<init>()
                        return
                }

                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View r9) {
                        r8 = this;
                        androidx.mediarouter.app.o$h$g r9 = r8.f2884Y
                        f1.o$i r0 = r9.f2841u
                        boolean r9 = r9.m1548z(r0)
                        r0 = 1
                        r9 = r9 ^ r0
                        androidx.mediarouter.app.o$h$g r1 = r8.f2884Y
                        f1.o$i r1 = r1.f2841u
                        boolean r1 = r1.m5067f()
                        java.lang.String r2 = "MediaRouter"
                        java.lang.String r3 = "There is no currently selected dynamic group route."
                        r4 = 0
                        androidx.mediarouter.app.o$h$g r5 = r8.f2884Y
                        androidx.mediarouter.app.o$h r6 = r5.f2881H
                        androidx.mediarouter.app.o r6 = r6.f2856m
                        f1.o r6 = r6.f2807a0
                        f1.o$i r5 = r5.f2841u
                        java.util.Objects.requireNonNull(r6)
                        if (r9 == 0) goto L72
                        p085f1.C1974o.m5025b()
                        f1.o$e r6 = p085f1.C1974o.f8670d
                        f1.i$e r7 = r6.f8698r
                        boolean r7 = r7 instanceof p085f1.AbstractC1966i.b
                        if (r7 == 0) goto L6c
                        f1.o$i r3 = r6.f8697q
                        f1.o$i$a r3 = r3.m5063b(r5)
                        f1.o$i r7 = r6.f8697q
                        java.util.List r7 = r7.m5064c()
                        boolean r7 = r7.contains(r5)
                        if (r7 != 0) goto L57
                        if (r3 == 0) goto L57
                        boolean r3 = r3.m5077a()
                        if (r3 != 0) goto L4c
                        goto L57
                    L4c:
                        f1.i$e r2 = r6.f8698r
                        f1.i$b r2 = (p085f1.AbstractC1966i.b) r2
                        java.lang.String r3 = r5.f8734b
                        r2.mo4873m(r3)
                        goto Lcd
                    L57:
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r6 = "Ignoring attempt to add a non-groupable route to dynamic group : "
                        r3.append(r6)
                        r3.append(r5)
                        java.lang.String r3 = r3.toString()
                        android.util.Log.w(r2, r3)
                        goto Lcd
                    L6c:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        r9.<init>(r3)
                        throw r9
                    L72:
                        p085f1.C1974o.m5025b()
                        f1.o$e r6 = p085f1.C1974o.f8670d
                        f1.i$e r7 = r6.f8698r
                        boolean r7 = r7 instanceof p085f1.AbstractC1966i.b
                        if (r7 == 0) goto L17f
                        f1.o$i r3 = r6.f8697q
                        f1.o$i$a r3 = r3.m5063b(r5)
                        f1.o$i r7 = r6.f8697q
                        java.util.List r7 = r7.m5064c()
                        boolean r7 = r7.contains(r5)
                        if (r7 == 0) goto Lb9
                        if (r3 == 0) goto Lb9
                        f1.i$b$b r3 = r3.f8755a
                        if (r3 == 0) goto L9c
                        boolean r3 = r3.f8631c
                        if (r3 == 0) goto L9a
                        goto L9c
                    L9a:
                        r3 = 0
                        goto L9d
                    L9c:
                        r3 = 1
                    L9d:
                        if (r3 != 0) goto La0
                        goto Lb9
                    La0:
                        f1.o$i r3 = r6.f8697q
                        java.util.List r3 = r3.m5064c()
                        int r3 = r3.size()
                        if (r3 > r0) goto Laf
                        java.lang.String r3 = "Ignoring attempt to remove the last member route."
                        goto Lca
                    Laf:
                        f1.i$e r2 = r6.f8698r
                        f1.i$b r2 = (p085f1.AbstractC1966i.b) r2
                        java.lang.String r3 = r5.f8734b
                        r2.mo4874n(r3)
                        goto Lcd
                    Lb9:
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r6 = "Ignoring attempt to remove a non-unselectable member route : "
                        r3.append(r6)
                        r3.append(r5)
                        java.lang.String r3 = r3.toString()
                    Lca:
                        android.util.Log.w(r2, r3)
                    Lcd:
                        androidx.mediarouter.app.o$h$g r2 = r8.f2884Y
                        r3 = r1 ^ 1
                        r2.m1547A(r9, r3)
                        if (r1 == 0) goto L11a
                        androidx.mediarouter.app.o$h$g r1 = r8.f2884Y
                        androidx.mediarouter.app.o$h r1 = r1.f2881H
                        androidx.mediarouter.app.o r1 = r1.f2856m
                        f1.o$i r1 = r1.f2810d0
                        java.util.List r1 = r1.m5064c()
                        androidx.mediarouter.app.o$h$g r2 = r8.f2884Y
                        f1.o$i r2 = r2.f2841u
                        java.util.List r2 = r2.m5064c()
                        java.util.Iterator r2 = r2.iterator()
                    Lee:
                        boolean r3 = r2.hasNext()
                        if (r3 == 0) goto L11a
                        java.lang.Object r3 = r2.next()
                        f1.o$i r3 = (p085f1.C1974o.i) r3
                        boolean r5 = r1.contains(r3)
                        if (r5 == r9) goto Lee
                        androidx.mediarouter.app.o$h$g r5 = r8.f2884Y
                        androidx.mediarouter.app.o$h r5 = r5.f2881H
                        androidx.mediarouter.app.o r5 = r5.f2856m
                        java.util.Map<java.lang.String, androidx.mediarouter.app.o$f> r5 = r5.f2823q0
                        java.lang.String r3 = r3.f8735c
                        java.lang.Object r3 = r5.get(r3)
                        androidx.mediarouter.app.o$f r3 = (androidx.mediarouter.app.DialogC0495o.f) r3
                        boolean r5 = r3 instanceof androidx.mediarouter.app.DialogC0495o.h.g
                        if (r5 == 0) goto Lee
                        androidx.mediarouter.app.o$h$g r3 = (androidx.mediarouter.app.DialogC0495o.h.g) r3
                        r3.m1547A(r9, r0)
                        goto Lee
                    L11a:
                        androidx.mediarouter.app.o$h$g r1 = r8.f2884Y
                        androidx.mediarouter.app.o$h r2 = r1.f2881H
                        f1.o$i r1 = r1.f2841u
                        androidx.mediarouter.app.o r3 = r2.f2856m
                        f1.o$i r3 = r3.f2810d0
                        java.util.List r3 = r3.m5064c()
                        int r5 = r3.size()
                        int r5 = java.lang.Math.max(r0, r5)
                        boolean r6 = r1.m5067f()
                        r7 = -1
                        if (r6 == 0) goto L158
                        java.util.List r1 = r1.m5064c()
                        java.util.Iterator r1 = r1.iterator()
                    L13f:
                        boolean r6 = r1.hasNext()
                        if (r6 == 0) goto L15c
                        java.lang.Object r6 = r1.next()
                        f1.o$i r6 = (p085f1.C1974o.i) r6
                        boolean r6 = r3.contains(r6)
                        if (r6 == r9) goto L13f
                        if (r9 == 0) goto L155
                        r6 = 1
                        goto L156
                    L155:
                        r6 = -1
                    L156:
                        int r5 = r5 + r6
                        goto L13f
                    L158:
                        if (r9 == 0) goto L15b
                        r7 = 1
                    L15b:
                        int r5 = r5 + r7
                    L15c:
                        boolean r9 = r2.m1544k()
                        r1 = 2
                        if (r5 < r1) goto L164
                        goto L165
                    L164:
                        r0 = 0
                    L165:
                        if (r9 == r0) goto L17e
                        androidx.mediarouter.app.o r9 = r2.f2856m
                        androidx.recyclerview.widget.RecyclerView r9 = r9.f2820n0
                        androidx.recyclerview.widget.RecyclerView$b0 r9 = r9.m1730G(r4)
                        boolean r1 = r9 instanceof androidx.mediarouter.app.DialogC0495o.h.d
                        if (r1 == 0) goto L17e
                        androidx.mediarouter.app.o$h$d r9 = (androidx.mediarouter.app.DialogC0495o.h.d) r9
                        android.view.View r1 = r9.f3208a
                        if (r0 == 0) goto L17b
                        int r4 = r9.f2870z
                    L17b:
                        r2.m1542i(r1, r4)
                    L17e:
                        return
                    L17f:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        r9.<init>(r3)
                        throw r9
                }
            }

            public g(androidx.mediarouter.app.DialogC0495o.h r4, android.view.View r5) {
                    r3 = this;
                    r3.f2881H = r4
                    androidx.mediarouter.app.o r0 = r4.f2856m
                    r1 = 2131362375(0x7f0a0247, float:1.8344529E38)
                    android.view.View r1 = r5.findViewById(r1)
                    android.widget.ImageButton r1 = (android.widget.ImageButton) r1
                    r2 = 2131362381(0x7f0a024d, float:1.834454E38)
                    android.view.View r2 = r5.findViewById(r2)
                    androidx.mediarouter.app.MediaRouteVolumeSlider r2 = (androidx.mediarouter.app.MediaRouteVolumeSlider) r2
                    r3.<init>(r0, r5, r1, r2)
                    androidx.mediarouter.app.o$h$g$a r0 = new androidx.mediarouter.app.o$h$g$a
                    r0.<init>(r3)
                    r3.f2880G = r0
                    r3.f2882y = r5
                    r0 = 2131362376(0x7f0a0248, float:1.834453E38)
                    android.view.View r0 = r5.findViewById(r0)
                    android.widget.ImageView r0 = (android.widget.ImageView) r0
                    r3.f2883z = r0
                    r0 = 2131362378(0x7f0a024a, float:1.8344535E38)
                    android.view.View r0 = r5.findViewById(r0)
                    android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                    r3.f2874A = r0
                    r1 = 2131362377(0x7f0a0249, float:1.8344533E38)
                    android.view.View r1 = r5.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r3.f2875B = r1
                    r1 = 2131362380(0x7f0a024c, float:1.8344539E38)
                    android.view.View r1 = r5.findViewById(r1)
                    android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
                    r3.f2876C = r1
                    r1 = 2131362362(0x7f0a023a, float:1.8344502E38)
                    android.view.View r5 = r5.findViewById(r1)
                    android.widget.CheckBox r5 = (android.widget.CheckBox) r5
                    r3.f2877D = r5
                    androidx.mediarouter.app.o r1 = r4.f2856m
                    android.content.Context r1 = r1.f2815i0
                    r2 = 2131231305(0x7f080249, float:1.8078687E38)
                    android.graphics.drawable.Drawable r1 = androidx.mediarouter.app.C0498r.m1554f(r1, r2)
                    r5.setButtonDrawable(r1)
                    androidx.mediarouter.app.o r5 = r4.f2856m
                    android.content.Context r5 = r5.f2815i0
                    androidx.mediarouter.app.C0498r.m1560l(r5, r0)
                    androidx.mediarouter.app.o r5 = r4.f2856m
                    android.content.Context r5 = r5.f2815i0
                    float r5 = androidx.mediarouter.app.C0498r.m1552d(r5)
                    r3.f2878E = r5
                    androidx.mediarouter.app.o r4 = r4.f2856m
                    android.content.Context r4 = r4.f2815i0
                    android.content.res.Resources r4 = r4.getResources()
                    android.util.DisplayMetrics r5 = r4.getDisplayMetrics()
                    android.util.TypedValue r0 = new android.util.TypedValue
                    r0.<init>()
                    r1 = 2131165464(0x7f070118, float:1.7945146E38)
                    r2 = 1
                    r4.getValue(r1, r0, r2)
                    float r4 = r0.getDimension(r5)
                    int r4 = (int) r4
                    r3.f2879F = r4
                    return
            }

            /* renamed from: A */
            public void m1547A(boolean r4, boolean r5) {
                    r3 = this;
                    android.widget.CheckBox r0 = r3.f2877D
                    r1 = 0
                    r0.setEnabled(r1)
                    android.view.View r0 = r3.f2882y
                    r0.setEnabled(r1)
                    android.widget.CheckBox r0 = r3.f2877D
                    r0.setChecked(r4)
                    if (r4 == 0) goto L1d
                    android.widget.ImageView r0 = r3.f2883z
                    r2 = 4
                    r0.setVisibility(r2)
                    android.widget.ProgressBar r0 = r3.f2874A
                    r0.setVisibility(r1)
                L1d:
                    if (r5 == 0) goto L2a
                    androidx.mediarouter.app.o$h r5 = r3.f2881H
                    android.widget.RelativeLayout r0 = r3.f2876C
                    if (r4 == 0) goto L27
                    int r1 = r3.f2879F
                L27:
                    r5.m1542i(r0, r1)
                L2a:
                    return
            }

            /* renamed from: z */
            public boolean m1548z(p085f1.C1974o.i r3) {
                    r2 = this;
                    boolean r0 = r3.m5069h()
                    r1 = 1
                    if (r0 == 0) goto L8
                    return r1
                L8:
                    androidx.mediarouter.app.o$h r0 = r2.f2881H
                    androidx.mediarouter.app.o r0 = r0.f2856m
                    f1.o$i r0 = r0.f2810d0
                    f1.o$i$a r3 = r0.m5063b(r3)
                    if (r3 == 0) goto L20
                    f1.i$b$b r3 = r3.f8755a
                    if (r3 == 0) goto L1b
                    int r3 = r3.f8630b
                    goto L1c
                L1b:
                    r3 = 1
                L1c:
                    r0 = 3
                    if (r3 != r0) goto L20
                    goto L21
                L20:
                    r1 = 0
                L21:
                    return r1
            }
        }

        public h(androidx.mediarouter.app.DialogC0495o r3) {
                r2 = this;
                r2.f2856m = r3
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f2847d = r0
                android.content.Context r0 = r3.f2815i0
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r2.f2848e = r0
                android.content.Context r0 = r3.f2815i0
                r1 = 2130969259(0x7f0402ab, float:1.7547195E38)
                android.graphics.drawable.Drawable r0 = androidx.mediarouter.app.C0498r.m1553e(r0, r1)
                r2.f2849f = r0
                android.content.Context r0 = r3.f2815i0
                r1 = 2130969268(0x7f0402b4, float:1.7547213E38)
                android.graphics.drawable.Drawable r0 = androidx.mediarouter.app.C0498r.m1553e(r0, r1)
                r2.f2850g = r0
                android.content.Context r0 = r3.f2815i0
                r1 = 2130969265(0x7f0402b1, float:1.7547207E38)
                android.graphics.drawable.Drawable r0 = androidx.mediarouter.app.C0498r.m1553e(r0, r1)
                r2.f2851h = r0
                android.content.Context r0 = r3.f2815i0
                r1 = 2130969264(0x7f0402b0, float:1.7547205E38)
                android.graphics.drawable.Drawable r0 = androidx.mediarouter.app.C0498r.m1553e(r0, r1)
                r2.f2852i = r0
                android.content.Context r3 = r3.f2815i0
                android.content.res.Resources r3 = r3.getResources()
                r0 = 2131427352(0x7f0b0018, float:1.8476318E38)
                int r3 = r3.getInteger(r0)
                r2.f2854k = r3
                android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
                r3.<init>()
                r2.f2855l = r3
                r2.m1546m()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
        /* renamed from: b */
        public int mo1521b() {
                r1 = this;
                java.util.ArrayList<androidx.mediarouter.app.o$h$f> r0 = r1.f2847d
                int r0 = r0.size()
                int r0 = r0 + 1
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
        /* renamed from: d */
        public int mo1522d(int r2) {
                r1 = this;
                if (r2 != 0) goto L5
                androidx.mediarouter.app.o$h$f r2 = r1.f2853j
                goto Lf
            L5:
                java.util.ArrayList<androidx.mediarouter.app.o$h$f> r0 = r1.f2847d
                int r2 = r2 + (-1)
                java.lang.Object r2 = r0.get(r2)
                androidx.mediarouter.app.o$h$f r2 = (androidx.mediarouter.app.DialogC0495o.h.f) r2
            Lf:
                int r2 = r2.f2873b
                return r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
        /* renamed from: e */
        public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r9, int r10) {
                r8 = this;
                int r0 = r8.mo1522d(r10)
                if (r10 != 0) goto L9
                androidx.mediarouter.app.o$h$f r10 = r8.f2853j
                goto L13
            L9:
                java.util.ArrayList<androidx.mediarouter.app.o$h$f> r1 = r8.f2847d
                int r10 = r10 + (-1)
                java.lang.Object r10 = r1.get(r10)
                androidx.mediarouter.app.o$h$f r10 = (androidx.mediarouter.app.DialogC0495o.h.f) r10
            L13:
                r1 = 1
                r2 = 0
                if (r0 == r1) goto L1ae
                r3 = 2
                if (r0 == r3) goto L19d
                r4 = 3
                r5 = 4
                r6 = 1065353216(0x3f800000, float:1.0)
                if (r0 == r4) goto L7f
                if (r0 == r5) goto L2b
                java.lang.String r9 = "MediaRouteCtrlDialog"
                java.lang.String r10 = "Cannot bind item to ViewHolder because of wrong view type"
                android.util.Log.w(r9, r10)
                goto L1dd
            L2b:
                androidx.mediarouter.app.o$h$c r9 = (androidx.mediarouter.app.DialogC0495o.h.c) r9
                java.util.Objects.requireNonNull(r9)
                java.lang.Object r10 = r10.f2872a
                f1.o$i r10 = (p085f1.C1974o.i) r10
                r9.f2867z = r10
                android.widget.ImageView r0 = r9.f2863v
                r0.setVisibility(r2)
                android.widget.ProgressBar r0 = r9.f2864w
                r0.setVisibility(r5)
                androidx.mediarouter.app.o$h r0 = r9.f2861A
                androidx.mediarouter.app.o r0 = r0.f2856m
                f1.o$i r0 = r0.f2810d0
                java.util.List r0 = r0.m5064c()
                int r3 = r0.size()
                if (r3 != r1) goto L57
                java.lang.Object r0 = r0.get(r2)
                if (r0 != r10) goto L57
                r1 = 0
            L57:
                android.view.View r0 = r9.f2862u
                if (r1 == 0) goto L5c
                goto L5e
            L5c:
                float r6 = r9.f2866y
            L5e:
                r0.setAlpha(r6)
                android.view.View r0 = r9.f2862u
                androidx.mediarouter.app.p r1 = new androidx.mediarouter.app.p
                r1.<init>(r9)
                r0.setOnClickListener(r1)
                android.widget.ImageView r0 = r9.f2863v
                androidx.mediarouter.app.o$h r1 = r9.f2861A
                android.graphics.drawable.Drawable r1 = r1.m1543j(r10)
                r0.setImageDrawable(r1)
                android.widget.TextView r9 = r9.f2865x
                java.lang.String r10 = r10.f8736d
                r9.setText(r10)
                goto L1dd
            L7f:
                java.lang.Object r0 = r10.f2872a
                f1.o$i r0 = (p085f1.C1974o.i) r0
                androidx.mediarouter.app.o r4 = r8.f2856m
                java.util.Map<java.lang.String, androidx.mediarouter.app.o$f> r4 = r4.f2823q0
                java.lang.String r0 = r0.f8735c
                r7 = r9
                androidx.mediarouter.app.o$f r7 = (androidx.mediarouter.app.DialogC0495o.f) r7
                r4.put(r0, r7)
                androidx.mediarouter.app.o$h$g r9 = (androidx.mediarouter.app.DialogC0495o.h.g) r9
                java.util.Objects.requireNonNull(r9)
                java.lang.Object r10 = r10.f2872a
                f1.o$i r10 = (p085f1.C1974o.i) r10
                androidx.mediarouter.app.o$h r0 = r9.f2881H
                androidx.mediarouter.app.o r0 = r0.f2856m
                f1.o$i r0 = r0.f2810d0
                if (r10 != r0) goto Lcb
                java.util.List r0 = r10.m5064c()
                int r0 = r0.size()
                if (r0 <= 0) goto Lcb
                java.util.List r0 = r10.m5064c()
                java.util.Iterator r0 = r0.iterator()
            Lb2:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto Lcb
                java.lang.Object r4 = r0.next()
                f1.o$i r4 = (p085f1.C1974o.i) r4
                androidx.mediarouter.app.o$h r7 = r9.f2881H
                androidx.mediarouter.app.o r7 = r7.f2856m
                java.util.List<f1.o$i> r7 = r7.f2812f0
                boolean r7 = r7.contains(r4)
                if (r7 != 0) goto Lb2
                r10 = r4
            Lcb:
                r9.m1539x(r10)
                android.widget.ImageView r0 = r9.f2883z
                androidx.mediarouter.app.o$h r4 = r9.f2881H
                android.graphics.drawable.Drawable r4 = r4.m1543j(r10)
                r0.setImageDrawable(r4)
                android.widget.TextView r0 = r9.f2875B
                java.lang.String r4 = r10.f8736d
                r0.setText(r4)
                android.widget.CheckBox r0 = r9.f2877D
                r0.setVisibility(r2)
                boolean r0 = r9.m1548z(r10)
                androidx.mediarouter.app.o$h r4 = r9.f2881H
                androidx.mediarouter.app.o r4 = r4.f2856m
                java.util.List<f1.o$i> r4 = r4.f2814h0
                boolean r4 = r4.contains(r10)
                if (r4 == 0) goto Lf6
                goto L12e
            Lf6:
                boolean r4 = r9.m1548z(r10)
                if (r4 == 0) goto L10d
                androidx.mediarouter.app.o$h r4 = r9.f2881H
                androidx.mediarouter.app.o r4 = r4.f2856m
                f1.o$i r4 = r4.f2810d0
                java.util.List r4 = r4.m5064c()
                int r4 = r4.size()
                if (r4 >= r3) goto L10d
                goto L12e
            L10d:
                boolean r3 = r9.m1548z(r10)
                if (r3 == 0) goto L130
                androidx.mediarouter.app.o$h r3 = r9.f2881H
                androidx.mediarouter.app.o r3 = r3.f2856m
                f1.o$i r3 = r3.f2810d0
                f1.o$i$a r10 = r3.m5063b(r10)
                if (r10 == 0) goto L12e
                f1.i$b$b r10 = r10.f8755a
                if (r10 == 0) goto L12a
                boolean r10 = r10.f8631c
                if (r10 == 0) goto L128
                goto L12a
            L128:
                r10 = 0
                goto L12b
            L12a:
                r10 = 1
            L12b:
                if (r10 == 0) goto L12e
                goto L130
            L12e:
                r10 = 0
                goto L131
            L130:
                r10 = 1
            L131:
                android.widget.CheckBox r3 = r9.f2877D
                r3.setChecked(r0)
                android.widget.ProgressBar r3 = r9.f2874A
                r3.setVisibility(r5)
                android.widget.ImageView r3 = r9.f2883z
                r3.setVisibility(r2)
                android.view.View r3 = r9.f2882y
                r3.setEnabled(r10)
                android.widget.CheckBox r3 = r9.f2877D
                r3.setEnabled(r10)
                android.widget.ImageButton r3 = r9.f2842v
                if (r10 != 0) goto L153
                if (r0 == 0) goto L151
                goto L153
            L151:
                r4 = 0
                goto L154
            L153:
                r4 = 1
            L154:
                r3.setEnabled(r4)
                androidx.mediarouter.app.MediaRouteVolumeSlider r3 = r9.f2843w
                if (r10 != 0) goto L15f
                if (r0 == 0) goto L15e
                goto L15f
            L15e:
                r1 = 0
            L15f:
                r3.setEnabled(r1)
                android.view.View r1 = r9.f2882y
                android.view.View$OnClickListener r3 = r9.f2880G
                r1.setOnClickListener(r3)
                android.widget.CheckBox r1 = r9.f2877D
                android.view.View$OnClickListener r3 = r9.f2880G
                r1.setOnClickListener(r3)
                android.widget.RelativeLayout r1 = r9.f2876C
                if (r0 == 0) goto L17e
                f1.o$i r3 = r9.f2841u
                boolean r3 = r3.m5067f()
                if (r3 != 0) goto L17e
                int r2 = r9.f2879F
            L17e:
                androidx.mediarouter.app.DialogC0495o.m1527g(r1, r2)
                android.view.View r1 = r9.f2882y
                if (r10 != 0) goto L18b
                if (r0 == 0) goto L188
                goto L18b
            L188:
                float r2 = r9.f2878E
                goto L18d
            L18b:
                r2 = 1065353216(0x3f800000, float:1.0)
            L18d:
                r1.setAlpha(r2)
                android.widget.CheckBox r1 = r9.f2877D
                if (r10 != 0) goto L199
                if (r0 != 0) goto L197
                goto L199
            L197:
                float r6 = r9.f2878E
            L199:
                r1.setAlpha(r6)
                goto L1dd
            L19d:
                androidx.mediarouter.app.o$h$e r9 = (androidx.mediarouter.app.DialogC0495o.h.e) r9
                java.util.Objects.requireNonNull(r9)
                java.lang.Object r10 = r10.f2872a
                java.lang.String r10 = r10.toString()
                android.widget.TextView r9 = r9.f2871u
                r9.setText(r10)
                goto L1dd
            L1ae:
                java.lang.Object r0 = r10.f2872a
                f1.o$i r0 = (p085f1.C1974o.i) r0
                androidx.mediarouter.app.o r1 = r8.f2856m
                java.util.Map<java.lang.String, androidx.mediarouter.app.o$f> r1 = r1.f2823q0
                java.lang.String r0 = r0.f8735c
                r3 = r9
                androidx.mediarouter.app.o$f r3 = (androidx.mediarouter.app.DialogC0495o.f) r3
                r1.put(r0, r3)
                androidx.mediarouter.app.o$h$d r9 = (androidx.mediarouter.app.DialogC0495o.h.d) r9
                android.view.View r0 = r9.f3208a
                androidx.mediarouter.app.o$h r1 = r9.f2868A
                boolean r1 = r1.m1544k()
                if (r1 == 0) goto L1cc
                int r2 = r9.f2870z
            L1cc:
                androidx.mediarouter.app.DialogC0495o.m1527g(r0, r2)
                java.lang.Object r10 = r10.f2872a
                f1.o$i r10 = (p085f1.C1974o.i) r10
                r9.m1539x(r10)
                android.widget.TextView r9 = r9.f2869y
                java.lang.String r10 = r10.f8736d
                r9.setText(r10)
            L1dd:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
        /* renamed from: g */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r3, int r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                if (r4 == r0) goto L43
                r0 = 2
                if (r4 == r0) goto L34
                r0 = 3
                if (r4 == r0) goto L25
                r0 = 4
                if (r4 == r0) goto L16
                java.lang.String r3 = "MediaRouteCtrlDialog"
                java.lang.String r4 = "Cannot create ViewHolder because of wrong view type"
                android.util.Log.w(r3, r4)
                r3 = 0
                return r3
            L16:
                android.view.LayoutInflater r4 = r2.f2848e
                r0 = 2131558507(0x7f0d006b, float:1.8742332E38)
                android.view.View r3 = r4.inflate(r0, r3, r1)
                androidx.mediarouter.app.o$h$c r4 = new androidx.mediarouter.app.o$h$c
                r4.<init>(r2, r3)
                return r4
            L25:
                android.view.LayoutInflater r4 = r2.f2848e
                r0 = 2131558511(0x7f0d006f, float:1.874234E38)
                android.view.View r3 = r4.inflate(r0, r3, r1)
                androidx.mediarouter.app.o$h$g r4 = new androidx.mediarouter.app.o$h$g
                r4.<init>(r2, r3)
                return r4
            L34:
                android.view.LayoutInflater r4 = r2.f2848e
                r0 = 2131558509(0x7f0d006d, float:1.8742336E38)
                android.view.View r3 = r4.inflate(r0, r3, r1)
                androidx.mediarouter.app.o$h$e r4 = new androidx.mediarouter.app.o$h$e
                r4.<init>(r2, r3)
                return r4
            L43:
                android.view.LayoutInflater r4 = r2.f2848e
                r0 = 2131558508(0x7f0d006c, float:1.8742334E38)
                android.view.View r3 = r4.inflate(r0, r3, r1)
                androidx.mediarouter.app.o$h$d r4 = new androidx.mediarouter.app.o$h$d
                r4.<init>(r2, r3)
                return r4
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
        /* renamed from: h */
        public void mo1541h(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2) {
                r1 = this;
                androidx.mediarouter.app.o r0 = r1.f2856m
                java.util.Map<java.lang.String, androidx.mediarouter.app.o$f> r0 = r0.f2823q0
                java.util.Collection r0 = r0.values()
                r0.remove(r2)
                return
        }

        /* renamed from: i */
        public void m1542i(android.view.View r5, int r6) {
                r4 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                int r0 = r0.height
                androidx.mediarouter.app.o$h$a r1 = new androidx.mediarouter.app.o$h$a
                r1.<init>(r4, r6, r0, r5)
                androidx.mediarouter.app.o$h$b r6 = new androidx.mediarouter.app.o$h$b
                r6.<init>(r4)
                r1.setAnimationListener(r6)
                int r6 = r4.f2854k
                long r2 = (long) r6
                r1.setDuration(r2)
                android.view.animation.Interpolator r6 = r4.f2855l
                r1.setInterpolator(r6)
                r5.startAnimation(r1)
                return
        }

        /* renamed from: j */
        public android.graphics.drawable.Drawable m1543j(p085f1.C1974o.i r5) {
                r4 = this;
                android.net.Uri r0 = r5.f8738f
                if (r0 == 0) goto L2f
                androidx.mediarouter.app.o r1 = r4.f2856m     // Catch: java.io.IOException -> L18
                android.content.Context r1 = r1.f2815i0     // Catch: java.io.IOException -> L18
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L18
                java.io.InputStream r1 = r1.openInputStream(r0)     // Catch: java.io.IOException -> L18
                r2 = 0
                android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch: java.io.IOException -> L18
                if (r0 == 0) goto L2f
                return r0
            L18:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to load "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                java.lang.String r2 = "MediaRouteCtrlDialog"
                android.util.Log.w(r2, r0, r1)
            L2f:
                int r0 = r5.f8745m
                r1 = 1
                if (r0 == r1) goto L46
                r1 = 2
                if (r0 == r1) goto L43
                boolean r5 = r5.m5067f()
                if (r5 == 0) goto L40
                android.graphics.drawable.Drawable r5 = r4.f2852i
                goto L48
            L40:
                android.graphics.drawable.Drawable r5 = r4.f2849f
                goto L48
            L43:
                android.graphics.drawable.Drawable r5 = r4.f2851h
                goto L48
            L46:
                android.graphics.drawable.Drawable r5 = r4.f2850g
            L48:
                return r5
        }

        /* renamed from: k */
        public boolean m1544k() {
                r2 = this;
                androidx.mediarouter.app.o r0 = r2.f2856m
                f1.o$i r0 = r0.f2810d0
                java.util.List r0 = r0.m5064c()
                int r0 = r0.size()
                r1 = 1
                if (r0 <= r1) goto L10
                goto L11
            L10:
                r1 = 0
            L11:
                return r1
        }

        /* renamed from: l */
        public void m1545l() {
                r7 = this;
                androidx.mediarouter.app.o r0 = r7.f2856m
                java.util.List<f1.o$i> r0 = r0.f2814h0
                r0.clear()
                androidx.mediarouter.app.o r0 = r7.f2856m
                java.util.List<f1.o$i> r1 = r0.f2814h0
                java.util.List<f1.o$i> r2 = r0.f2812f0
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                f1.o$i r4 = r0.f2810d0
                f1.o$h r4 = r4.f8733a
                java.util.List r4 = r4.m5061b()
                java.util.Iterator r4 = r4.iterator()
            L1e:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L3c
                java.lang.Object r5 = r4.next()
                f1.o$i r5 = (p085f1.C1974o.i) r5
                f1.o$i r6 = r0.f2810d0
                f1.o$i$a r6 = r6.m5063b(r5)
                if (r6 == 0) goto L1e
                boolean r6 = r6.m5077a()
                if (r6 == 0) goto L1e
                r3.add(r5)
                goto L1e
            L3c:
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>(r2)
                r0.removeAll(r3)
                r1.addAll(r0)
                androidx.recyclerview.widget.RecyclerView$f r0 = r7.f3228a
                r0.m1813b()
                return
        }

        /* renamed from: m */
        public void m1546m() {
                r10 = this;
                java.util.ArrayList<androidx.mediarouter.app.o$h$f> r0 = r10.f2847d
                r0.clear()
                androidx.mediarouter.app.o$h$f r0 = new androidx.mediarouter.app.o$h$f
                androidx.mediarouter.app.o r1 = r10.f2856m
                f1.o$i r2 = r1.f2810d0
                r3 = 1
                r0.<init>(r10, r2, r3)
                r10.f2853j = r0
                java.util.List<f1.o$i> r0 = r1.f2811e0
                boolean r0 = r0.isEmpty()
                r1 = 3
                if (r0 != 0) goto L39
                androidx.mediarouter.app.o r0 = r10.f2856m
                java.util.List<f1.o$i> r0 = r0.f2811e0
                java.util.Iterator r0 = r0.iterator()
            L22:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L47
                java.lang.Object r2 = r0.next()
                f1.o$i r2 = (p085f1.C1974o.i) r2
                java.util.ArrayList<androidx.mediarouter.app.o$h$f> r4 = r10.f2847d
                androidx.mediarouter.app.o$h$f r5 = new androidx.mediarouter.app.o$h$f
                r5.<init>(r10, r2, r1)
                r4.add(r5)
                goto L22
            L39:
                java.util.ArrayList<androidx.mediarouter.app.o$h$f> r0 = r10.f2847d
                androidx.mediarouter.app.o$h$f r2 = new androidx.mediarouter.app.o$h$f
                androidx.mediarouter.app.o r4 = r10.f2856m
                f1.o$i r4 = r4.f2810d0
                r2.<init>(r10, r4, r1)
                r0.add(r2)
            L47:
                androidx.mediarouter.app.o r0 = r10.f2856m
                java.util.List<f1.o$i> r0 = r0.f2812f0
                boolean r0 = r0.isEmpty()
                r2 = 2
                r4 = 0
                r5 = 0
                if (r0 != 0) goto Lac
                androidx.mediarouter.app.o r0 = r10.f2856m
                java.util.List<f1.o$i> r0 = r0.f2812f0
                java.util.Iterator r0 = r0.iterator()
                r6 = 0
            L5d:
                boolean r7 = r0.hasNext()
                if (r7 == 0) goto Lac
                java.lang.Object r7 = r0.next()
                f1.o$i r7 = (p085f1.C1974o.i) r7
                androidx.mediarouter.app.o r8 = r10.f2856m
                java.util.List<f1.o$i> r8 = r8.f2811e0
                boolean r8 = r8.contains(r7)
                if (r8 != 0) goto L5d
                if (r6 != 0) goto La1
                androidx.mediarouter.app.o r6 = r10.f2856m
                f1.o$i r6 = r6.f2810d0
                f1.i$b r6 = r6.m5062a()
                if (r6 == 0) goto L84
                java.lang.String r6 = r6.mo4898j()
                goto L85
            L84:
                r6 = r4
            L85:
                boolean r8 = android.text.TextUtils.isEmpty(r6)
                if (r8 == 0) goto L96
                androidx.mediarouter.app.o r6 = r10.f2856m
                android.content.Context r6 = r6.f2815i0
                r8 = 2131951899(0x7f13011b, float:1.9540226E38)
                java.lang.String r6 = r6.getString(r8)
            L96:
                java.util.ArrayList<androidx.mediarouter.app.o$h$f> r8 = r10.f2847d
                androidx.mediarouter.app.o$h$f r9 = new androidx.mediarouter.app.o$h$f
                r9.<init>(r10, r6, r2)
                r8.add(r9)
                r6 = 1
            La1:
                java.util.ArrayList<androidx.mediarouter.app.o$h$f> r8 = r10.f2847d
                androidx.mediarouter.app.o$h$f r9 = new androidx.mediarouter.app.o$h$f
                r9.<init>(r10, r7, r1)
                r8.add(r9)
                goto L5d
            Lac:
                androidx.mediarouter.app.o r0 = r10.f2856m
                java.util.List<f1.o$i> r0 = r0.f2813g0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L106
                androidx.mediarouter.app.o r0 = r10.f2856m
                java.util.List<f1.o$i> r0 = r0.f2813g0
                java.util.Iterator r0 = r0.iterator()
            Lbe:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L106
                java.lang.Object r1 = r0.next()
                f1.o$i r1 = (p085f1.C1974o.i) r1
                androidx.mediarouter.app.o r6 = r10.f2856m
                f1.o$i r6 = r6.f2810d0
                if (r6 == r1) goto Lbe
                if (r5 != 0) goto Lfa
                f1.i$b r5 = r6.m5062a()
                if (r5 == 0) goto Ldd
                java.lang.String r5 = r5.mo4899k()
                goto Lde
            Ldd:
                r5 = r4
            Lde:
                boolean r6 = android.text.TextUtils.isEmpty(r5)
                if (r6 == 0) goto Lef
                androidx.mediarouter.app.o r5 = r10.f2856m
                android.content.Context r5 = r5.f2815i0
                r6 = 2131951900(0x7f13011c, float:1.9540228E38)
                java.lang.String r5 = r5.getString(r6)
            Lef:
                java.util.ArrayList<androidx.mediarouter.app.o$h$f> r6 = r10.f2847d
                androidx.mediarouter.app.o$h$f r7 = new androidx.mediarouter.app.o$h$f
                r7.<init>(r10, r5, r2)
                r6.add(r7)
                r5 = 1
            Lfa:
                java.util.ArrayList<androidx.mediarouter.app.o$h$f> r6 = r10.f2847d
                androidx.mediarouter.app.o$h$f r7 = new androidx.mediarouter.app.o$h$f
                r8 = 4
                r7.<init>(r10, r1, r8)
                r6.add(r7)
                goto Lbe
            L106:
                r10.m1545l()
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.o$i */
    public static final class i implements java.util.Comparator<p085f1.C1974o.i> {

        /* renamed from: Y */
        public static final androidx.mediarouter.app.DialogC0495o.i f2885Y = null;

        static {
                androidx.mediarouter.app.o$i r0 = new androidx.mediarouter.app.o$i
                r0.<init>()
                androidx.mediarouter.app.DialogC0495o.i.f2885Y = r0
                return
        }

        public i() {
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

    /* renamed from: androidx.mediarouter.app.o$j */
    public class j implements android.widget.SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0495o f2886a;

        public j(androidx.mediarouter.app.DialogC0495o r1) {
                r0 = this;
                r0.f2886a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r2, int r3, boolean r4) {
                r1 = this;
                if (r4 == 0) goto L21
                java.lang.Object r2 = r2.getTag()
                f1.o$i r2 = (p085f1.C1974o.i) r2
                androidx.mediarouter.app.o r4 = r1.f2886a
                java.util.Map<java.lang.String, androidx.mediarouter.app.o$f> r4 = r4.f2823q0
                java.lang.String r0 = r2.f8735c
                java.lang.Object r4 = r4.get(r0)
                androidx.mediarouter.app.o$f r4 = (androidx.mediarouter.app.DialogC0495o.f) r4
                if (r4 == 0) goto L1e
                if (r3 != 0) goto L1a
                r0 = 1
                goto L1b
            L1a:
                r0 = 0
            L1b:
                r4.m1540y(r0)
            L1e:
                r2.m5072k(r3)
            L21:
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar r3) {
                r2 = this;
                androidx.mediarouter.app.o r0 = r2.f2886a
                f1.o$i r1 = r0.f2824r0
                if (r1 == 0) goto Lc
                android.os.Handler r0 = r0.f2819m0
                r1 = 2
                r0.removeMessages(r1)
            Lc:
                androidx.mediarouter.app.o r0 = r2.f2886a
                java.lang.Object r3 = r3.getTag()
                f1.o$i r3 = (p085f1.C1974o.i) r3
                r0.f2824r0 = r3
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar r4) {
                r3 = this;
                androidx.mediarouter.app.o r4 = r3.f2886a
                android.os.Handler r4 = r4.f2819m0
                r0 = 2
                r1 = 500(0x1f4, double:2.47E-321)
                r4.sendEmptyMessageDelayed(r0, r1)
                return
        }
    }

    static {
            java.lang.String r0 = "MediaRouteCtrlDialog"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            androidx.mediarouter.app.DialogC0495o.f2793N0 = r0
            return
    }

    public DialogC0495o(android.content.Context r2) {
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.C0498r.m1549a(r2, r0, r0)
            int r0 = androidx.mediarouter.app.C0498r.m1550b(r2)
            r1.<init>(r2, r0)
            f1.n r2 = p085f1.C1973n.f8666c
            r1.f2809c0 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2811e0 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2812f0 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2813g0 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2814h0 = r2
            androidx.mediarouter.app.o$a r2 = new androidx.mediarouter.app.o$a
            r2.<init>(r1)
            r1.f2819m0 = r2
            android.content.Context r2 = r1.getContext()
            r1.f2815i0 = r2
            f1.o r2 = p085f1.C1974o.m5026d(r2)
            r1.f2807a0 = r2
            androidx.mediarouter.app.o$g r0 = new androidx.mediarouter.app.o$g
            r0.<init>(r1)
            r1.f2808b0 = r0
            f1.o$i r0 = r2.m5031g()
            r1.f2810d0 = r0
            androidx.mediarouter.app.o$e r0 = new androidx.mediarouter.app.o$e
            r0.<init>(r1)
            r1.f2799F0 = r0
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.m5029e()
            r1.m1530i(r2)
            return
    }

    /* renamed from: d */
    public static boolean m1526d(android.graphics.Bitmap r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: g */
    public static void m1527g(android.view.View r1, int r2) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r2
            r1.setLayoutParams(r0)
            return
    }

    /* renamed from: e */
    public void m1528e(java.util.List<p085f1.C1974o.i> r5) {
            r4 = this;
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 - r1
        L6:
            if (r0 < 0) goto L2f
            java.lang.Object r2 = r5.get(r0)
            f1.o$i r2 = (p085f1.C1974o.i) r2
            boolean r3 = r2.m5066e()
            if (r3 != 0) goto L26
            boolean r3 = r2.f8739g
            if (r3 == 0) goto L26
            f1.n r3 = r4.f2809c0
            boolean r3 = r2.m5070i(r3)
            if (r3 == 0) goto L26
            f1.o$i r3 = r4.f2810d0
            if (r3 == r2) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            if (r2 != 0) goto L2c
            r5.remove(r0)
        L2c:
            int r0 = r0 + (-1)
            goto L6
        L2f:
            return
    }

    /* renamed from: f */
    public void m1529f() {
            r4 = this;
            android.support.v4.media.MediaDescriptionCompat r0 = r4.f2800G0
            r1 = 0
            if (r0 != 0) goto L7
            r2 = r1
            goto L9
        L7:
            android.graphics.Bitmap r2 = r0.f489c0
        L9:
            if (r0 != 0) goto Lc
            goto Le
        Lc:
            android.net.Uri r1 = r0.f490d0
        Le:
            androidx.mediarouter.app.o$d r0 = r4.f2801H0
            if (r0 != 0) goto L15
            android.graphics.Bitmap r3 = r4.f2802I0
            goto L17
        L15:
            android.graphics.Bitmap r3 = r0.f2836a
        L17:
            if (r0 != 0) goto L1c
            android.net.Uri r0 = r4.f2803J0
            goto L1e
        L1c:
            android.net.Uri r0 = r0.f2837b
        L1e:
            if (r3 != r2) goto L29
            if (r3 != 0) goto L28
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L29
        L28:
            return
        L29:
            androidx.mediarouter.app.o$d r0 = r4.f2801H0
            if (r0 == 0) goto L31
            r1 = 1
            r0.cancel(r1)
        L31:
            androidx.mediarouter.app.o$d r0 = new androidx.mediarouter.app.o$d
            r0.<init>(r4)
            r4.f2801H0 = r0
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.execute(r1)
            return
    }

    /* renamed from: i */
    public final void m1530i(android.support.v4.media.session.MediaSessionCompat.Token r4) {
            r3 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r3.f2798E0
            r1 = 0
            if (r0 == 0) goto Lc
            androidx.mediarouter.app.o$e r2 = r3.f2799F0
            r0.m263e(r2)
            r3.f2798E0 = r1
        Lc:
            if (r4 != 0) goto Lf
            return
        Lf:
            boolean r0 = r3.f2817k0
            if (r0 != 0) goto L14
            return
        L14:
            android.support.v4.media.session.MediaControllerCompat r0 = new android.support.v4.media.session.MediaControllerCompat
            android.content.Context r2 = r3.f2815i0
            r0.<init>(r2, r4)
            r3.f2798E0 = r0
            androidx.mediarouter.app.o$e r4 = r3.f2799F0
            r0.m262d(r4)
            android.support.v4.media.session.MediaControllerCompat r4 = r3.f2798E0
            android.support.v4.media.MediaMetadataCompat r4 = r4.m259a()
            if (r4 != 0) goto L2b
            goto L2f
        L2b:
            android.support.v4.media.MediaDescriptionCompat r1 = r4.m230d()
        L2f:
            r3.f2800G0 = r1
            r3.m1529f()
            r3.m1534o()
            return
    }

    /* renamed from: j */
    public void m1531j(p085f1.C1973n r4) {
            r3 = this;
            if (r4 == 0) goto L23
            f1.n r0 = r3.f2809c0
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L22
            r3.f2809c0 = r4
            boolean r0 = r3.f2817k0
            if (r0 == 0) goto L22
            f1.o r0 = r3.f2807a0
            androidx.mediarouter.app.o$g r1 = r3.f2808b0
            r0.m5033i(r1)
            f1.o r0 = r3.f2807a0
            androidx.mediarouter.app.o$g r1 = r3.f2808b0
            r2 = 1
            r0.m5027a(r4, r1, r2)
            r3.m1535p()
        L22:
            return
        L23:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "selector must not be null"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: k */
    public final boolean m1532k() {
            r2 = this;
            f1.o$i r0 = r2.f2824r0
            r1 = 1
            if (r0 != 0) goto Le
            boolean r0 = r2.f2826t0
            if (r0 == 0) goto La
            goto Le
        La:
            boolean r0 = r2.f2816j0
            r0 = r0 ^ r1
            return r0
        Le:
            return r1
    }

    /* renamed from: m */
    public void m1533m() {
            r3 = this;
            android.content.Context r0 = r3.f2815i0
            int r0 = androidx.mediarouter.app.C0492l.m1517b(r0)
            android.content.Context r1 = r3.f2815i0
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
            r0 = 0
            r3.f2802I0 = r0
            r3.f2803J0 = r0
            r3.m1529f()
            r3.m1534o()
            r3.m1536q()
            return
    }

    /* renamed from: o */
    public void m1534o() {
            r10 = this;
            boolean r0 = r10.m1532k()
            r1 = 1
            if (r0 == 0) goto La
            r10.f2828v0 = r1
            return
        La:
            r0 = 0
            r10.f2828v0 = r0
            f1.o$i r2 = r10.f2810d0
            boolean r2 = r2.m5069h()
            if (r2 == 0) goto L1d
            f1.o$i r2 = r10.f2810d0
            boolean r2 = r2.m5066e()
            if (r2 == 0) goto L20
        L1d:
            r10.dismiss()
        L20:
            boolean r2 = r10.f2804K0
            r3 = 8
            r4 = 0
            if (r2 == 0) goto L8f
            android.graphics.Bitmap r2 = r10.f2805L0
            boolean r2 = m1526d(r2)
            if (r2 != 0) goto L8f
            android.graphics.Bitmap r2 = r10.f2805L0
            if (r2 == 0) goto L8f
            android.widget.ImageView r2 = r10.f2794A0
            r2.setVisibility(r0)
            android.widget.ImageView r2 = r10.f2794A0
            android.graphics.Bitmap r5 = r10.f2805L0
            r2.setImageBitmap(r5)
            android.widget.ImageView r2 = r10.f2794A0
            int r5 = r10.f2806M0
            r2.setBackgroundColor(r5)
            android.view.View r2 = r10.f2832z0
            r2.setVisibility(r0)
            android.graphics.Bitmap r2 = r10.f2805L0
            r5 = 1092616192(0x41200000, float:10.0)
            android.content.Context r6 = r10.f2815i0
            android.renderscript.RenderScript r6 = android.renderscript.RenderScript.create(r6)
            android.renderscript.Allocation r7 = android.renderscript.Allocation.createFromBitmap(r6, r2)
            android.renderscript.Type r8 = r7.getType()
            android.renderscript.Allocation r8 = android.renderscript.Allocation.createTyped(r6, r8)
            android.renderscript.Element r9 = android.renderscript.Element.U8_4(r6)
            android.renderscript.ScriptIntrinsicBlur r9 = android.renderscript.ScriptIntrinsicBlur.create(r6, r9)
            r9.setRadius(r5)
            r9.setInput(r7)
            r9.forEach(r8)
            android.graphics.Bitmap$Config r5 = r2.getConfig()
            android.graphics.Bitmap r2 = r2.copy(r5, r1)
            r8.copyTo(r2)
            r7.destroy()
            r8.destroy()
            r9.destroy()
            r6.destroy()
            android.widget.ImageView r5 = r10.f2831y0
            r5.setImageBitmap(r2)
            goto Lba
        L8f:
            android.graphics.Bitmap r2 = r10.f2805L0
            boolean r2 = m1526d(r2)
            if (r2 == 0) goto Lab
            java.lang.String r2 = "Can't set artwork image with recycled bitmap: "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            android.graphics.Bitmap r5 = r10.f2805L0
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "MediaRouteCtrlDialog"
            android.util.Log.w(r5, r2)
        Lab:
            android.widget.ImageView r2 = r10.f2794A0
            r2.setVisibility(r3)
            android.view.View r2 = r10.f2832z0
            r2.setVisibility(r3)
            android.widget.ImageView r2 = r10.f2831y0
            r2.setImageBitmap(r4)
        Lba:
            r10.f2804K0 = r0
            r10.f2805L0 = r4
            r10.f2806M0 = r0
            android.support.v4.media.MediaDescriptionCompat r2 = r10.f2800G0
            if (r2 != 0) goto Lc6
            r2 = r4
            goto Lc8
        Lc6:
            java.lang.CharSequence r2 = r2.f486Z
        Lc8:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            r5 = r5 ^ r1
            android.support.v4.media.MediaDescriptionCompat r6 = r10.f2800G0
            if (r6 != 0) goto Ld2
            goto Ld4
        Ld2:
            java.lang.CharSequence r4 = r6.f487a0
        Ld4:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r1 = r1 ^ r6
            if (r5 == 0) goto Le1
            android.widget.TextView r5 = r10.f2795B0
            r5.setText(r2)
            goto Le8
        Le1:
            android.widget.TextView r2 = r10.f2795B0
            java.lang.String r5 = r10.f2797D0
            r2.setText(r5)
        Le8:
            if (r1 == 0) goto Lf5
            android.widget.TextView r1 = r10.f2796C0
            r1.setText(r4)
            android.widget.TextView r1 = r10.f2796C0
            r1.setVisibility(r0)
            goto Lfa
        Lf5:
            android.widget.TextView r0 = r10.f2796C0
            r0.setVisibility(r3)
        Lfa:
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            r0 = 1
            r4.f2817k0 = r0
            f1.o r1 = r4.f2807a0
            f1.n r2 = r4.f2809c0
            androidx.mediarouter.app.o$g r3 = r4.f2808b0
            r1.m5027a(r2, r3, r0)
            r4.m1535p()
            f1.o r0 = r4.f2807a0
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r0.m5029e()
            r4.m1530i(r0)
            return
    }

    @Override // p083f.DialogC1929p, android.app.Dialog
    public void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            r4 = 2131558506(0x7f0d006a, float:1.874233E38)
            r3.setContentView(r4)
            android.content.Context r4 = r3.f2815i0
            androidx.mediarouter.app.C0498r.m1559k(r4, r3)
            r4 = 2131362363(0x7f0a023b, float:1.8344504E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r3.f2829w0 = r4
            r0 = -1
            r4.setColorFilter(r0)
            android.widget.ImageButton r4 = r3.f2829w0
            androidx.mediarouter.app.o$b r1 = new androidx.mediarouter.app.o$b
            r1.<init>(r3)
            r4.setOnClickListener(r1)
            r4 = 2131362379(0x7f0a024b, float:1.8344537E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r3.f2830x0 = r4
            r4.setTextColor(r0)
            android.widget.Button r4 = r3.f2830x0
            androidx.mediarouter.app.o$c r1 = new androidx.mediarouter.app.o$c
            r1.<init>(r3)
            r4.setOnClickListener(r1)
            androidx.mediarouter.app.o$h r4 = new androidx.mediarouter.app.o$h
            r4.<init>(r3)
            r3.f2821o0 = r4
            r4 = 2131362369(0x7f0a0241, float:1.8344517E38)
            android.view.View r4 = r3.findViewById(r4)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r3.f2820n0 = r4
            androidx.mediarouter.app.o$h r1 = r3.f2821o0
            r4.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r4 = r3.f2820n0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r3.f2815i0
            r1.<init>(r2)
            r4.setLayoutManager(r1)
            androidx.mediarouter.app.o$j r4 = new androidx.mediarouter.app.o$j
            r4.<init>(r3)
            r3.f2822p0 = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.f2823q0 = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.f2825s0 = r4
            r4 = 2131362371(0x7f0a0243, float:1.834452E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f2831y0 = r4
            r4 = 2131362372(0x7f0a0244, float:1.8344523E38)
            android.view.View r4 = r3.findViewById(r4)
            r3.f2832z0 = r4
            r4 = 2131362370(0x7f0a0242, float:1.8344519E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f2794A0 = r4
            r4 = 2131362374(0x7f0a0246, float:1.8344527E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f2795B0 = r4
            r4.setTextColor(r0)
            r4 = 2131362373(0x7f0a0245, float:1.8344525E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f2796C0 = r4
            r4.setTextColor(r0)
            android.content.Context r4 = r3.f2815i0
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2131951882(0x7f13010a, float:1.9540191E38)
            java.lang.String r4 = r4.getString(r0)
            r3.f2797D0 = r4
            r4 = 1
            r3.f2816j0 = r4
            r3.m1533m()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r2.f2817k0 = r0
            f1.o r0 = r2.f2807a0
            androidx.mediarouter.app.o$g r1 = r2.f2808b0
            r0.m5033i(r1)
            android.os.Handler r0 = r2.f2819m0
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r2.m1530i(r1)
            return
    }

    /* renamed from: p */
    public void m1535p() {
            r4 = this;
            java.util.List<f1.o$i> r0 = r4.f2811e0
            r0.clear()
            java.util.List<f1.o$i> r0 = r4.f2812f0
            r0.clear()
            java.util.List<f1.o$i> r0 = r4.f2813g0
            r0.clear()
            java.util.List<f1.o$i> r0 = r4.f2811e0
            f1.o$i r1 = r4.f2810d0
            java.util.List r1 = r1.m5064c()
            r0.addAll(r1)
            f1.o$i r0 = r4.f2810d0
            f1.o$h r0 = r0.f8733a
            java.util.List r0 = r0.m5061b()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            f1.o$i r1 = (p085f1.C1974o.i) r1
            f1.o$i r2 = r4.f2810d0
            f1.o$i$a r2 = r2.m5063b(r1)
            if (r2 != 0) goto L3b
            goto L26
        L3b:
            boolean r3 = r2.m5077a()
            if (r3 == 0) goto L46
            java.util.List<f1.o$i> r3 = r4.f2812f0
            r3.add(r1)
        L46:
            f1.i$b$b r2 = r2.f8755a
            if (r2 == 0) goto L50
            boolean r2 = r2.f8633e
            if (r2 == 0) goto L50
            r2 = 1
            goto L51
        L50:
            r2 = 0
        L51:
            if (r2 == 0) goto L26
            java.util.List<f1.o$i> r2 = r4.f2813g0
            r2.add(r1)
            goto L26
        L59:
            java.util.List<f1.o$i> r0 = r4.f2812f0
            r4.m1528e(r0)
            java.util.List<f1.o$i> r0 = r4.f2813g0
            r4.m1528e(r0)
            java.util.List<f1.o$i> r0 = r4.f2811e0
            androidx.mediarouter.app.o$i r1 = androidx.mediarouter.app.DialogC0495o.i.f2885Y
            java.util.Collections.sort(r0, r1)
            java.util.List<f1.o$i> r0 = r4.f2812f0
            java.util.Collections.sort(r0, r1)
            java.util.List<f1.o$i> r0 = r4.f2813g0
            java.util.Collections.sort(r0, r1)
            androidx.mediarouter.app.o$h r0 = r4.f2821o0
            r0.m1546m()
            return
    }

    /* renamed from: q */
    public void m1536q() {
            r7 = this;
            boolean r0 = r7.f2817k0
            if (r0 == 0) goto L4a
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r7.f2818l0
            long r0 = r0 - r2
            r2 = 300(0x12c, double:1.48E-321)
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L3d
            boolean r0 = r7.m1532k()
            if (r0 == 0) goto L1b
            r7.f2827u0 = r4
            return
        L1b:
            r0 = 0
            r7.f2827u0 = r0
            f1.o$i r0 = r7.f2810d0
            boolean r0 = r0.m5069h()
            if (r0 == 0) goto L2e
            f1.o$i r0 = r7.f2810d0
            boolean r0 = r0.m5066e()
            if (r0 == 0) goto L31
        L2e:
            r7.dismiss()
        L31:
            long r0 = android.os.SystemClock.uptimeMillis()
            r7.f2818l0 = r0
            androidx.mediarouter.app.o$h r0 = r7.f2821o0
            r0.m1545l()
            goto L4a
        L3d:
            android.os.Handler r0 = r7.f2819m0
            r0.removeMessages(r4)
            android.os.Handler r0 = r7.f2819m0
            long r5 = r7.f2818l0
            long r5 = r5 + r2
            r0.sendEmptyMessageAtTime(r4, r5)
        L4a:
            return
    }

    /* renamed from: r */
    public void m1537r() {
            r1 = this;
            boolean r0 = r1.f2827u0
            if (r0 == 0) goto L7
            r1.m1536q()
        L7:
            boolean r0 = r1.f2828v0
            if (r0 == 0) goto Le
            r1.m1534o()
        Le:
            return
    }
}
