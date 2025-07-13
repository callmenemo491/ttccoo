package p277pi;

/* renamed from: pi.b */
/* loaded from: classes.dex */
public final class C5528b {

    /* renamed from: a */
    public static final char[] f21528a = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            p277pi.C5528b.f21528a = r0
            return
    }

    /* renamed from: a */
    public static final int m11789a(char r3) {
            r0 = 48
            if (r0 <= r3) goto L5
            goto Lb
        L5:
            r1 = 57
            if (r1 < r3) goto Lb
            int r3 = r3 - r0
            goto L20
        Lb:
            r0 = 102(0x66, float:1.43E-43)
            r1 = 97
            if (r1 <= r3) goto L12
            goto L15
        L12:
            if (r0 < r3) goto L15
            goto L1d
        L15:
            r0 = 70
            r1 = 65
            if (r1 > r3) goto L21
            if (r0 < r3) goto L21
        L1d:
            int r3 = r3 - r1
            int r3 = r3 + 10
        L20:
            return r3
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected hex digit: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
