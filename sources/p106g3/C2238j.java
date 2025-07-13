package p106g3;

/* renamed from: g3.j */
/* loaded from: classes.dex */
public final class C2238j {

    /* renamed from: a */
    public static final char[] f10214a = null;

    /* renamed from: b */
    public static final char[] f10215b = null;

    /* renamed from: c */
    public static volatile android.os.Handler f10216c;

    /* renamed from: g3.j$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10217a = null;

        static {
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p106g3.C2238j.a.f10217a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = p106g3.C2238j.a.f10217a     // Catch: java.lang.NoSuchFieldError -> L1d
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = p106g3.C2238j.a.f10217a     // Catch: java.lang.NoSuchFieldError -> L28
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = p106g3.C2238j.a.f10217a     // Catch: java.lang.NoSuchFieldError -> L33
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = p106g3.C2238j.a.f10217a     // Catch: java.lang.NoSuchFieldError -> L3e
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    static {
            java.lang.String r0 = "0123456789abcdef"
            char[] r0 = r0.toCharArray()
            p106g3.C2238j.f10214a = r0
            r0 = 64
            char[] r0 = new char[r0]
            p106g3.C2238j.f10215b = r0
            return
    }

    public C2238j() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static void m5841a() {
            boolean r0 = m5849i()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You must call this method on the main thread"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public static boolean m5842b(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto Lc
        L6:
            r0 = 0
            goto Lc
        L8:
            boolean r0 = r0.equals(r1)
        Lc:
            return r0
    }

    /* renamed from: c */
    public static int m5843c(int r2, int r3, android.graphics.Bitmap.Config r4) {
            int r2 = r2 * r3
            if (r4 != 0) goto L6
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            int[] r3 = p106g3.C2238j.a.f10217a
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 4
            r0 = 1
            r1 = 2
            if (r3 == r0) goto L20
            if (r3 == r1) goto L1e
            r0 = 3
            if (r3 == r0) goto L1e
            if (r3 == r4) goto L1b
            goto L21
        L1b:
            r4 = 8
            goto L21
        L1e:
            r4 = 2
            goto L21
        L20:
            r4 = 1
        L21:
            int r2 = r2 * r4
            return r2
    }

    @android.annotation.TargetApi(19)
    /* renamed from: d */
    public static int m5844d(android.graphics.Bitmap r3) {
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L16
            int r3 = r3.getAllocationByteCount()     // Catch: java.lang.NullPointerException -> Lb
            return r3
        Lb:
            int r0 = r3.getHeight()
            int r3 = r3.getRowBytes()
            int r3 = r3 * r0
            return r3
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot obtain size for recycled Bitmap: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "["
            r1.append(r2)
            int r2 = r3.getWidth()
            r1.append(r2)
            java.lang.String r2 = "x"
            r1.append(r2)
            int r2 = r3.getHeight()
            r1.append(r2)
            java.lang.String r2 = "] "
            r1.append(r2)
            android.graphics.Bitmap$Config r3 = r3.getConfig()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: e */
    public static <T> java.util.List<T> m5845e(java.util.Collection<T> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto Ld
            r0.add(r1)
            goto Ld
        L1d:
            return r0
    }

    /* renamed from: f */
    public static android.os.Handler m5846f() {
            android.os.Handler r0 = p106g3.C2238j.f10216c
            if (r0 != 0) goto L1b
            java.lang.Class<g3.j> r0 = p106g3.C2238j.class
            monitor-enter(r0)
            android.os.Handler r1 = p106g3.C2238j.f10216c     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L16
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L18
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            p106g3.C2238j.f10216c = r1     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
        L1b:
            android.os.Handler r0 = p106g3.C2238j.f10216c
            return r0
    }

    /* renamed from: g */
    public static int m5847g(java.lang.Object r0, int r1) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: h */
    public static boolean m5848h() {
            boolean r0 = m5849i()
            r0 = r0 ^ 1
            return r0
    }

    /* renamed from: i */
    public static boolean m5849i() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* renamed from: j */
    public static boolean m5850j(int r3, int r4) {
            r0 = 1
            r1 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 > 0) goto Lb
            if (r3 != r2) goto L9
            goto Lb
        L9:
            r3 = 0
            goto Lc
        Lb:
            r3 = 1
        Lc:
            if (r3 == 0) goto L19
            if (r4 > 0) goto L15
            if (r4 != r2) goto L13
            goto L15
        L13:
            r3 = 0
            goto L16
        L15:
            r3 = 1
        L16:
            if (r3 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }
}
