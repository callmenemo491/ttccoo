package p121h4;

/* renamed from: h4.b */
/* loaded from: classes.dex */
public final class C2457b {

    /* renamed from: a */
    public static final int[] f10959a = null;

    /* renamed from: b */
    public static final int[] f10960b = null;

    /* renamed from: c */
    public static final int[] f10961c = null;

    /* renamed from: d */
    public static final int[] f10962d = null;

    /* renamed from: e */
    public static final int[] f10963e = null;

    /* renamed from: f */
    public static final int[] f10964f = null;

    static {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x0032: FILL_ARRAY_DATA , data: [1, 2, 3, 6} // fill-array
            p121h4.C2457b.f10959a = r0
            r0 = 3
            int[] r1 = new int[r0]
            r1 = {x003e: FILL_ARRAY_DATA , data: [48000, 44100, 32000} // fill-array
            p121h4.C2457b.f10960b = r1
            int[] r0 = new int[r0]
            r0 = {x0048: FILL_ARRAY_DATA , data: [24000, 22050, 16000} // fill-array
            p121h4.C2457b.f10961c = r0
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x0052: FILL_ARRAY_DATA , data: [2, 1, 2, 3, 3, 4, 4, 5} // fill-array
            p121h4.C2457b.f10962d = r0
            r0 = 19
            int[] r1 = new int[r0]
            r1 = {x0066: FILL_ARRAY_DATA , data: [32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640} // fill-array
            p121h4.C2457b.f10963e = r1
            int[] r0 = new int[r0]
            r0 = {x0090: FILL_ARRAY_DATA , data: [69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393} // fill-array
            p121h4.C2457b.f10964f = r0
            return
    }

    /* renamed from: a */
    public static int m6239a(int r4, int r5) {
            int r0 = r5 / 2
            if (r4 < 0) goto L2e
            int[] r1 = p121h4.C2457b.f10960b
            int r2 = r1.length
            if (r4 >= r2) goto L2e
            if (r5 < 0) goto L2e
            int[] r2 = p121h4.C2457b.f10964f
            int r3 = r2.length
            if (r0 < r3) goto L11
            goto L2e
        L11:
            r4 = r1[r4]
            r1 = 44100(0xac44, float:6.1797E-41)
            if (r4 != r1) goto L20
            r4 = r2[r0]
            int r5 = r5 % 2
            int r5 = r5 + r4
            int r5 = r5 * 2
            return r5
        L20:
            int[] r5 = p121h4.C2457b.f10963e
            r5 = r5[r0]
            r0 = 32000(0x7d00, float:4.4842E-41)
            if (r4 != r0) goto L2b
            int r5 = r5 * 6
            return r5
        L2b:
            int r5 = r5 * 4
            return r5
        L2e:
            r4 = -1
            return r4
    }
}
