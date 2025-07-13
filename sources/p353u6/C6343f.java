package p353u6;

/* renamed from: u6.f */
/* loaded from: classes.dex */
public class C6343f {

    /* renamed from: a */
    public static final char[] f24794a = null;

    /* renamed from: b */
    public static final char[] f24795b = null;

    static {
            r0 = 16
            char[] r1 = new char[r0]
            r1 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            p353u6.C6343f.f24794a = r1
            char[] r0 = new char[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            p353u6.C6343f.f24795b = r0
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public static java.lang.String m12993a(@androidx.annotation.RecentlyNonNull byte[] r5, boolean r6) {
            int r0 = r5.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 << 1
            r1.<init>(r2)
            r2 = 0
        L9:
            if (r2 >= r0) goto L30
            if (r6 == 0) goto L17
            int r3 = r0 + (-1)
            if (r2 != r3) goto L17
            r3 = r5[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L30
        L17:
            char[] r3 = p353u6.C6343f.f24794a
            r4 = r5[r2]
            r4 = r4 & 240(0xf0, float:3.36E-43)
            int r4 = r4 >>> 4
            char r4 = r3[r4]
            r1.append(r4)
            r4 = r5[r2]
            r4 = r4 & 15
            char r3 = r3[r4]
            r1.append(r3)
            int r2 = r2 + 1
            goto L9
        L30:
            java.lang.String r5 = r1.toString()
            return r5
    }
}
