package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {

    /* renamed from: k */
    public static final android.graphics.PorterDuff.Mode f1955k = null;

    /* renamed from: a */
    public int f1956a;

    /* renamed from: b */
    public java.lang.Object f1957b;

    /* renamed from: c */
    public byte[] f1958c;

    /* renamed from: d */
    public android.os.Parcelable f1959d;

    /* renamed from: e */
    public int f1960e;

    /* renamed from: f */
    public int f1961f;

    /* renamed from: g */
    public android.content.res.ColorStateList f1962g;

    /* renamed from: h */
    public android.graphics.PorterDuff.Mode f1963h;

    /* renamed from: i */
    public java.lang.String f1964i;

    /* renamed from: j */
    public java.lang.String f1965j;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.f1955k = r0
            return
    }

    public IconCompat() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f1956a = r0
            r0 = 0
            r2.f1958c = r0
            r2.f1959d = r0
            r1 = 0
            r2.f1960e = r1
            r2.f1961f = r1
            r2.f1962g = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.f1955k
            r2.f1963h = r1
            r2.f1964i = r0
            return
    }

    public IconCompat(int r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f1956a = r0
            r0 = 0
            r2.f1958c = r0
            r2.f1959d = r0
            r1 = 0
            r2.f1960e = r1
            r2.f1961f = r1
            r2.f1962g = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.f1955k
            r2.f1963h = r1
            r2.f1964i = r0
            r2.f1956a = r3
            return
    }

    /* renamed from: a */
    public static android.graphics.Bitmap m1007a(android.graphics.Bitmap r9, boolean r10) {
            int r0 = r9.getWidth()
            int r1 = r9.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            r1 = 1059760811(0x3f2aaaab, float:0.6666667)
            float r0 = r0 * r1
            int r0 = (int) r0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r0, r1)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 3
            r3.<init>(r4)
            float r4 = (float) r0
            r5 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r4
            r6 = 1063955115(0x3f6aaaab, float:0.9166667)
            float r6 = r6 * r5
            if (r10 == 0) goto L52
            r10 = 1009429163(0x3c2aaaab, float:0.010416667)
            float r10 = r10 * r4
            r7 = 0
            r3.setColor(r7)
            r7 = 1017817771(0x3caaaaab, float:0.020833334)
            float r4 = r4 * r7
            r7 = 1023410176(0x3d000000, float:0.03125)
            r8 = 0
            r3.setShadowLayer(r10, r8, r4, r7)
            r2.drawCircle(r5, r5, r6, r3)
            r4 = 503316480(0x1e000000, float:6.7762636E-21)
            r3.setShadowLayer(r10, r8, r8, r4)
            r2.drawCircle(r5, r5, r6, r3)
            r3.clearShadowLayer()
        L52:
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r10)
            android.graphics.BitmapShader r10 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r10.<init>(r9, r4, r4)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            int r7 = r9.getWidth()
            int r7 = r7 - r0
            int r7 = -r7
            int r7 = r7 / 2
            float r7 = (float) r7
            int r9 = r9.getHeight()
            int r9 = r9 - r0
            int r9 = -r9
            int r9 = r9 / 2
            float r9 = (float) r9
            r4.setTranslate(r7, r9)
            r10.setLocalMatrix(r4)
            r3.setShader(r10)
            r2.drawCircle(r5, r5, r6, r3)
            r9 = 0
            r2.setBitmap(r9)
            return r1
    }

    /* renamed from: b */
    public static androidx.core.graphics.drawable.IconCompat m1008b(android.content.res.Resources r2, java.lang.String r3, int r4) {
            if (r3 == 0) goto L2a
            if (r4 == 0) goto L22
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 2
            r0.<init>(r1)
            r0.f1960e = r4
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.getResourceName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L15
            r0.f1957b = r2     // Catch: android.content.res.Resources.NotFoundException -> L15
            goto L1f
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Icon resource cannot be found"
            r2.<init>(r3)
            throw r2
        L1d:
            r0.f1957b = r3
        L1f:
            r0.f1965j = r3
            return r0
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Drawable resource ID must not be 0"
            r2.<init>(r3)
            throw r2
        L2a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Package must not be null."
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: c */
    public int m1009c() {
            r7 = this;
            int r0 = r7.f1956a
            r1 = -1
            if (r0 != r1) goto L40
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L40
            java.lang.Object r0 = r7.f1957b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            java.lang.String r2 = "Unable to get icon resource"
            java.lang.String r3 = "IconCompat"
            r4 = 28
            if (r1 < r4) goto L1c
            int r0 = r0.getResId()
            goto L3f
        L1c:
            r1 = 0
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3a
            java.lang.String r5 = "getResId"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3a
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3a
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3a
            java.lang.Object r0 = r4.invoke(r0, r5)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3a
            int r0 = r0.intValue()     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3a
            goto L3f
        L36:
            r0 = move-exception
            goto L3b
        L38:
            r0 = move-exception
            goto L3b
        L3a:
            r0 = move-exception
        L3b:
            android.util.Log.e(r3, r2, r0)
            r0 = 0
        L3f:
            return r0
        L40:
            r1 = 2
            if (r0 != r1) goto L46
            int r0 = r7.f1960e
            return r0
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResId() on "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: d */
    public java.lang.String m1010d() {
            r8 = this;
            int r0 = r8.f1956a
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L3d
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L3d
            java.lang.Object r0 = r8.f1957b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            java.lang.String r2 = "Unable to get icon package"
            java.lang.String r4 = "IconCompat"
            r5 = 28
            if (r3 < r5) goto L1d
            java.lang.String r0 = r0.getResPackage()
            goto L3c
        L1d:
            r3 = 0
            java.lang.Class r5 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            java.lang.String r6 = "getResPackage"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            java.lang.Object r0 = r5.invoke(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            goto L3c
        L33:
            r0 = move-exception
            goto L38
        L35:
            r0 = move-exception
            goto L38
        L37:
            r0 = move-exception
        L38:
            android.util.Log.e(r4, r2, r0)
            r0 = r3
        L3c:
            return r0
        L3d:
            r3 = 2
            if (r0 != r3) goto L58
            java.lang.String r0 = r8.f1965j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L55
            java.lang.Object r0 = r8.f1957b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = ":"
            java.lang.String[] r0 = r0.split(r3, r2)
            r0 = r0[r1]
            return r0
        L55:
            java.lang.String r0 = r8.f1965j
            return r0
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResPackage() on "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: e */
    public int m1011e() {
            r6 = this;
            int r0 = r6.f1956a
            r1 = -1
            if (r0 != r1) goto L58
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L58
            java.lang.Object r0 = r6.f1957b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            r3 = 28
            if (r2 < r3) goto L18
            int r1 = r0.getType()
            goto L57
        L18:
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.String r3 = "getType"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.Object r2 = r2.invoke(r0, r3)     // Catch: java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            int r1 = r2.intValue()     // Catch: java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            goto L57
        L32:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L46
        L39:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L46
        L40:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L46:
            java.lang.String r4 = "Unable to get icon type "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "IconCompat"
            android.util.Log.e(r3, r0, r2)
        L57:
            return r1
        L58:
            return r0
    }

    /* renamed from: f */
    public android.net.Uri m1012f() {
            r8 = this;
            int r0 = r8.f1956a
            r1 = -1
            if (r0 != r1) goto L3d
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L3d
            java.lang.Object r0 = r8.f1957b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            java.lang.String r2 = "Unable to get icon uri"
            java.lang.String r3 = "IconCompat"
            r4 = 28
            if (r1 < r4) goto L1c
            android.net.Uri r0 = r0.getUri()
            goto L3c
        L1c:
            r1 = 0
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            java.lang.String r5 = "getUri"
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            java.lang.Object r0 = r4.invoke(r0, r5)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            goto L3c
        L33:
            r0 = move-exception
            goto L38
        L35:
            r0 = move-exception
            goto L38
        L37:
            r0 = move-exception
        L38:
            android.util.Log.e(r3, r2, r0)
            r0 = r1
        L3c:
            return r0
        L3d:
            r1 = 4
            if (r0 == r1) goto L5b
            r1 = 6
            if (r0 != r1) goto L44
            goto L5b
        L44:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getUri() on "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5b:
            java.lang.Object r0 = r8.f1957b
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }

    /* renamed from: g */
    public java.io.InputStream m1013g(android.content.Context r5) {
            r4 = this;
            android.net.Uri r0 = r4.m1012f()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            java.lang.String r3 = "IconCompat"
            if (r2 != 0) goto L33
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1b
            goto L33
        L1b:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L2a
            java.io.File r1 = new java.io.File     // Catch: java.io.FileNotFoundException -> L2a
            java.lang.Object r2 = r4.f1957b     // Catch: java.io.FileNotFoundException -> L2a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.FileNotFoundException -> L2a
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L2a
            r5.<init>(r1)     // Catch: java.io.FileNotFoundException -> L2a
            return r5
        L2a:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from path: "
            goto L44
        L33:
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L3c
            java.io.InputStream r5 = r5.openInputStream(r0)     // Catch: java.lang.Exception -> L3c
            return r5
        L3c:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from URI: "
        L44:
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0, r5)
            r5 = 0
            return r5
    }

    @java.lang.Deprecated
    /* renamed from: h */
    public android.graphics.drawable.Icon m1014h() {
            r1 = this;
            r0 = 0
            android.graphics.drawable.Icon r0 = r1.m1015i(r0)
            return r0
    }

    /* renamed from: i */
    public android.graphics.drawable.Icon m1015i(android.content.Context r5) {
            r4 = this;
            int r0 = r4.f1956a
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto Lad;
                case 0: goto L8;
                case 1: goto L94;
                case 2: goto L89;
                case 3: goto L7c;
                case 4: goto L73;
                case 5: goto L5d;
                case 6: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r5.<init>(r0)
            throw r5
        L10:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L20
            android.net.Uri r5 = r4.m1012f()
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r5)
            goto L9c
        L20:
            if (r5 == 0) goto L46
            java.io.InputStream r5 = r4.m1013g(r5)
            if (r5 == 0) goto L2f
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            if (r0 < r2) goto L6e
            goto L65
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot load adaptive icon from uri: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            android.net.Uri r1 = r4.m1012f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L46:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Context is required to resolve the file uri of the icon: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            android.net.Uri r1 = r4.m1012f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L5d:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L6a
            java.lang.Object r5 = r4.f1957b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L65:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto L9c
        L6a:
            java.lang.Object r5 = r4.f1957b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L6e:
            android.graphics.Bitmap r5 = m1007a(r5, r1)
            goto L98
        L73:
            java.lang.Object r5 = r4.f1957b
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
            goto L9c
        L7c:
            java.lang.Object r5 = r4.f1957b
            byte[] r5 = (byte[]) r5
            int r0 = r4.f1960e
            int r1 = r4.f1961f
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
            goto L9c
        L89:
            java.lang.String r5 = r4.m1010d()
            int r0 = r4.f1960e
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
            goto L9c
        L94:
            java.lang.Object r5 = r4.f1957b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L98:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
        L9c:
            android.content.res.ColorStateList r0 = r4.f1962g
            if (r0 == 0) goto La3
            r5.setTintList(r0)
        La3:
            android.graphics.PorterDuff$Mode r0 = r4.f1963h
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.f1955k
            if (r0 == r1) goto Lac
            r5.setTintMode(r0)
        Lac:
            return r5
        Lad:
            java.lang.Object r5 = r4.f1957b
            android.graphics.drawable.Icon r5 = (android.graphics.drawable.Icon) r5
            return r5
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f1956a
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r4.f1957b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f1956a
            switch(r1) {
                case 1: goto L2a;
                case 2: goto L27;
                case 3: goto L24;
                case 4: goto L21;
                case 5: goto L1e;
                case 6: goto L1b;
                default: goto L18;
            }
        L18:
            java.lang.String r1 = "UNKNOWN"
            goto L2c
        L1b:
            java.lang.String r1 = "URI_MASKABLE"
            goto L2c
        L1e:
            java.lang.String r1 = "BITMAP_MASKABLE"
            goto L2c
        L21:
            java.lang.String r1 = "URI"
            goto L2c
        L24:
            java.lang.String r1 = "DATA"
            goto L2c
        L27:
            java.lang.String r1 = "RESOURCE"
            goto L2c
        L2a:
            java.lang.String r1 = "BITMAP"
        L2c:
            r0.append(r1)
            int r1 = r4.f1956a
            switch(r1) {
                case 1: goto L7d;
                case 2: goto L56;
                case 3: goto L40;
                case 4: goto L35;
                case 5: goto L7d;
                case 6: goto L35;
                default: goto L34;
            }
        L34:
            goto L9d
        L35:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f1957b
            r0.append(r1)
            goto L9d
        L40:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f1960e
            r0.append(r1)
            int r1 = r4.f1961f
            if (r1 == 0) goto L9d
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f1961f
            goto L9a
        L56:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f1965j
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.m1009c()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L9d
        L7d:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f1957b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f1957b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L9a:
            r0.append(r1)
        L9d:
            android.content.res.ColorStateList r1 = r4.f1962g
            if (r1 == 0) goto Lab
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f1962g
            r0.append(r1)
        Lab:
            android.graphics.PorterDuff$Mode r1 = r4.f1963h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f1955k
            if (r1 == r2) goto Lbb
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f1963h
            r0.append(r1)
        Lbb:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
