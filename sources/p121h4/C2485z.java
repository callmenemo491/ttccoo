package p121h4;

/* renamed from: h4.z */
/* loaded from: classes.dex */
public final class C2485z {

    /* renamed from: a */
    public static final java.lang.String[] f11217a = null;

    /* renamed from: b */
    public static final int[] f11218b = null;

    /* renamed from: c */
    public static final int[] f11219c = null;

    /* renamed from: d */
    public static final int[] f11220d = null;

    /* renamed from: e */
    public static final int[] f11221e = null;

    /* renamed from: f */
    public static final int[] f11222f = null;

    /* renamed from: g */
    public static final int[] f11223g = null;

    /* renamed from: h4.z$a */
    public static final class a {

        /* renamed from: a */
        public int f11224a;

        /* renamed from: b */
        public java.lang.String f11225b;

        /* renamed from: c */
        public int f11226c;

        /* renamed from: d */
        public int f11227d;

        /* renamed from: e */
        public int f11228e;

        /* renamed from: f */
        public int f11229f;

        /* renamed from: g */
        public int f11230g;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public boolean m6357a(int r9) {
                r8 = this;
                boolean r0 = p121h4.C2485z.m6355c(r9)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                int r0 = r9 >>> 19
                r2 = 3
                r0 = r0 & r2
                r3 = 1
                if (r0 != r3) goto L10
                return r1
            L10:
                int r4 = r9 >>> 17
                r4 = r4 & r2
                if (r4 != 0) goto L16
                return r1
            L16:
                int r5 = r9 >>> 12
                r6 = 15
                r5 = r5 & r6
                if (r5 == 0) goto L9e
                if (r5 != r6) goto L21
                goto L9e
            L21:
                int r6 = r9 >>> 10
                r6 = r6 & r2
                if (r6 != r2) goto L27
                return r1
            L27:
                r8.f11224a = r0
                java.lang.String[] r1 = p121h4.C2485z.f11217a
                int r7 = 3 - r4
                r1 = r1[r7]
                r8.f11225b = r1
                int[] r1 = p121h4.C2485z.f11218b
                r1 = r1[r6]
                r8.f11227d = r1
                r6 = 2
                if (r0 != r6) goto L3e
                int r1 = r1 / r6
            L3b:
                r8.f11227d = r1
                goto L43
            L3e:
                if (r0 != 0) goto L43
                int r1 = r1 / 4
                goto L3b
            L43:
                int r1 = r9 >>> 9
                r1 = r1 & r3
                int r7 = p121h4.C2485z.m6354b(r0, r4)
                r8.f11230g = r7
                if (r4 != r2) goto L68
                if (r0 != r2) goto L56
                int[] r0 = p121h4.C2485z.f11219c
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L5b
            L56:
                int[] r0 = p121h4.C2485z.f11220d
                int r5 = r5 - r3
                r0 = r0[r5]
            L5b:
                r8.f11229f = r0
                int r0 = r0 * 12
                int r4 = r8.f11227d
                int r0 = r0 / r4
                int r0 = r0 + r1
                int r0 = r0 * 4
            L65:
                r8.f11226c = r0
                goto L95
            L68:
                r7 = 144(0x90, float:2.02E-43)
                if (r0 != r2) goto L82
                if (r4 != r6) goto L74
                int[] r0 = p121h4.C2485z.f11221e
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L79
            L74:
                int[] r0 = p121h4.C2485z.f11222f
                int r5 = r5 - r3
                r0 = r0[r5]
            L79:
                r8.f11229f = r0
                int r0 = r0 * 144
                int r4 = r8.f11227d
                int r0 = r0 / r4
                int r0 = r0 + r1
                goto L65
            L82:
                int[] r0 = p121h4.C2485z.f11223g
                int r5 = r5 - r3
                r0 = r0[r5]
                r8.f11229f = r0
                if (r4 != r3) goto L8d
                r7 = 72
            L8d:
                int r7 = r7 * r0
                int r0 = r8.f11227d
                int r7 = r7 / r0
                int r7 = r7 + r1
                r8.f11226c = r7
            L95:
                int r9 = r9 >> 6
                r9 = r9 & r2
                if (r9 != r2) goto L9b
                r6 = 1
            L9b:
                r8.f11228e = r6
                return r3
            L9e:
                return r1
        }
    }

    static {
            java.lang.String r0 = "audio/mpeg-L1"
            java.lang.String r1 = "audio/mpeg-L2"
            java.lang.String r2 = "audio/mpeg"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            p121h4.C2485z.f11217a = r0
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {x003a: FILL_ARRAY_DATA , data: [44100, 48000, 32000} // fill-array
            p121h4.C2485z.f11218b = r0
            r0 = 14
            int[] r1 = new int[r0]
            r1 = {x0044: FILL_ARRAY_DATA , data: [32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000} // fill-array
            p121h4.C2485z.f11219c = r1
            int[] r1 = new int[r0]
            r1 = {x0064: FILL_ARRAY_DATA , data: [32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000} // fill-array
            p121h4.C2485z.f11220d = r1
            int[] r1 = new int[r0]
            r1 = {x0084: FILL_ARRAY_DATA , data: [32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000} // fill-array
            p121h4.C2485z.f11221e = r1
            int[] r1 = new int[r0]
            r1 = {x00a4: FILL_ARRAY_DATA , data: [32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000} // fill-array
            p121h4.C2485z.f11222f = r1
            int[] r0 = new int[r0]
            r0 = {x00c4: FILL_ARRAY_DATA , data: [8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000} // fill-array
            p121h4.C2485z.f11223g = r0
            return
    }

    /* renamed from: a */
    public static int m6353a(int r7) {
            boolean r0 = m6355c(r7)
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r7 >>> 19
            r2 = 3
            r0 = r0 & r2
            r3 = 1
            if (r0 != r3) goto L10
            return r1
        L10:
            int r4 = r7 >>> 17
            r4 = r4 & r2
            if (r4 != 0) goto L16
            return r1
        L16:
            int r5 = r7 >>> 12
            r6 = 15
            r5 = r5 & r6
            if (r5 == 0) goto L76
            if (r5 != r6) goto L20
            goto L76
        L20:
            int r6 = r7 >>> 10
            r6 = r6 & r2
            if (r6 != r2) goto L26
            return r1
        L26:
            int[] r1 = p121h4.C2485z.f11218b
            r1 = r1[r6]
            r6 = 2
            if (r0 != r6) goto L30
            int r1 = r1 / 2
            goto L34
        L30:
            if (r0 != 0) goto L34
            int r1 = r1 / 4
        L34:
            int r7 = r7 >>> 9
            r7 = r7 & r3
            if (r4 != r2) goto L4d
            if (r0 != r2) goto L41
            int[] r0 = p121h4.C2485z.f11219c
            int r5 = r5 - r3
            r0 = r0[r5]
            goto L46
        L41:
            int[] r0 = p121h4.C2485z.f11220d
            int r5 = r5 - r3
            r0 = r0[r5]
        L46:
            int r0 = r0 * 12
            int r0 = r0 / r1
            int r0 = r0 + r7
            int r0 = r0 * 4
            return r0
        L4d:
            if (r0 != r2) goto L5d
            if (r4 != r6) goto L57
            int[] r6 = p121h4.C2485z.f11221e
            int r5 = r5 - r3
            r5 = r6[r5]
            goto L62
        L57:
            int[] r6 = p121h4.C2485z.f11222f
            int r5 = r5 - r3
            r5 = r6[r5]
            goto L62
        L5d:
            int[] r6 = p121h4.C2485z.f11223g
            int r5 = r5 - r3
            r5 = r6[r5]
        L62:
            r6 = 144(0x90, float:2.02E-43)
            if (r0 != r2) goto L6d
            r0 = 144(0x90, float:2.02E-43)
            int r7 = p121h4.C2484y.m6352a(r5, r0, r1, r7)
            return r7
        L6d:
            if (r4 != r3) goto L71
            r6 = 72
        L71:
            int r7 = p121h4.C2484y.m6352a(r6, r5, r1, r7)
            return r7
        L76:
            return r1
    }

    /* renamed from: b */
    public static int m6354b(int r3, int r4) {
            r0 = 1
            r1 = 1152(0x480, float:1.614E-42)
            r2 = 3
            if (r4 == r0) goto L15
            r3 = 2
            if (r4 == r3) goto L14
            if (r4 != r2) goto Le
            r3 = 384(0x180, float:5.38E-43)
            return r3
        Le:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L14:
            return r1
        L15:
            if (r3 != r2) goto L18
            goto L1a
        L18:
            r1 = 576(0x240, float:8.07E-43)
        L1a:
            return r1
    }

    /* renamed from: c */
    public static boolean m6355c(int r1) {
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r1 = r1 & r0
            if (r1 != r0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    /* renamed from: d */
    public static int m6356d(int r6) {
            boolean r0 = m6355c(r6)
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r6 >>> 19
            r2 = 3
            r0 = r0 & r2
            r3 = 1
            if (r0 != r3) goto L10
            return r1
        L10:
            int r3 = r6 >>> 17
            r3 = r3 & r2
            if (r3 != 0) goto L16
            return r1
        L16:
            int r4 = r6 >>> 12
            r5 = 15
            r4 = r4 & r5
            int r6 = r6 >>> 10
            r6 = r6 & r2
            if (r4 == 0) goto L2a
            if (r4 == r5) goto L2a
            if (r6 != r2) goto L25
            goto L2a
        L25:
            int r6 = m6354b(r0, r3)
            return r6
        L2a:
            return r1
    }
}
