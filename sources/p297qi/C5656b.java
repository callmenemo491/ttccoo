package p297qi;

/* renamed from: qi.b */
/* loaded from: classes.dex */
public class C5656b {

    /* renamed from: a */
    public static final char[] f21950a = null;

    /* renamed from: b */
    public static final char f21951b = 0;

    /* renamed from: c */
    public static final int[] f21952c = null;

    static {
            java.lang.String r0 = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz"
            char[] r0 = r0.toCharArray()
            p297qi.C5656b.f21950a = r0
            r1 = 0
            char r0 = r0[r1]
            p297qi.C5656b.f21951b = r0
            r0 = 128(0x80, float:1.8E-43)
            int[] r0 = new int[r0]
            p297qi.C5656b.f21952c = r0
            r2 = -1
            java.util.Arrays.fill(r0, r2)
        L17:
            char[] r0 = p297qi.C5656b.f21950a
            int r2 = r0.length
            if (r1 >= r2) goto L25
            int[] r2 = p297qi.C5656b.f21952c
            char r0 = r0[r1]
            r2[r0] = r1
            int r1 = r1 + 1
            goto L17
        L25:
            return
    }

    /* renamed from: a */
    public static byte[] m11934a(java.lang.String r8) {
            int r0 = r8.length()
            r1 = 0
            if (r0 != 0) goto La
            byte[] r8 = new byte[r1]
            return r8
        La:
            int r0 = r8.length()
            byte[] r2 = new byte[r0]
            r3 = 0
        L11:
            int r4 = r8.length()
            if (r3 >= r4) goto L33
            char r4 = r8.charAt(r3)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 >= r5) goto L24
            int[] r5 = p297qi.C5656b.f21952c
            r5 = r5[r4]
            goto L25
        L24:
            r5 = -1
        L25:
            if (r5 < 0) goto L2d
            byte r4 = (byte) r5
            r2[r3] = r4
            int r3 = r3 + 1
            goto L11
        L2d:
            qi.a$a r8 = new qi.a$a
            r8.<init>(r4, r3)
            throw r8
        L33:
            if (r1 >= r0) goto L3c
            r3 = r2[r1]
            if (r3 != 0) goto L3c
            int r1 = r1 + 1
            goto L33
        L3c:
            int r8 = r8.length()
            byte[] r3 = new byte[r8]
            r5 = r8
            r4 = r1
        L44:
            if (r4 >= r0) goto L59
            int r5 = r5 + (-1)
            r6 = 58
            r7 = 256(0x100, float:3.59E-43)
            byte r6 = m11935b(r2, r4, r6, r7)
            r3[r5] = r6
            r6 = r2[r4]
            if (r6 != 0) goto L44
            int r4 = r4 + 1
            goto L44
        L59:
            if (r5 >= r8) goto L62
            r0 = r3[r5]
            if (r0 != 0) goto L62
            int r5 = r5 + 1
            goto L59
        L62:
            int r5 = r5 - r1
            byte[] r8 = java.util.Arrays.copyOfRange(r3, r5, r8)
            return r8
    }

    /* renamed from: b */
    public static byte m11935b(byte[] r2, int r3, int r4, int r5) {
            r0 = 0
        L1:
            int r1 = r2.length
            if (r3 >= r1) goto L14
            r1 = r2[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 * r4
            int r0 = r0 + r1
            int r1 = r0 / r5
            byte r1 = (byte) r1
            r2[r3] = r1
            int r0 = r0 % r5
            int r3 = r3 + 1
            goto L1
        L14:
            byte r2 = (byte) r0
            return r2
    }

    /* renamed from: c */
    public static java.lang.String m11936c(byte[] r8) {
            int r0 = r8.length
            if (r0 != 0) goto L6
            java.lang.String r8 = ""
            return r8
        L6:
            r0 = 0
        L7:
            int r1 = r8.length
            if (r0 >= r1) goto L11
            r1 = r8[r0]
            if (r1 != 0) goto L11
            int r0 = r0 + 1
            goto L7
        L11:
            int r1 = r8.length
            byte[] r8 = java.util.Arrays.copyOf(r8, r1)
            int r1 = r8.length
            int r1 = r1 * 2
            char[] r2 = new char[r1]
            r3 = r0
            r4 = r1
        L1d:
            int r5 = r8.length
            if (r3 >= r5) goto L37
            int r4 = r4 + (-1)
            char[] r5 = p297qi.C5656b.f21950a
            r6 = 256(0x100, float:3.59E-43)
            r7 = 58
            byte r6 = m11935b(r8, r3, r6, r7)
            char r5 = r5[r6]
            r2[r4] = r5
            r5 = r8[r3]
            if (r5 != 0) goto L1d
            int r3 = r3 + 1
            goto L1d
        L37:
            if (r4 >= r1) goto L42
            char r8 = r2[r4]
            char r3 = p297qi.C5656b.f21951b
            if (r8 != r3) goto L42
            int r4 = r4 + 1
            goto L37
        L42:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L4d
            int r4 = r4 + (-1)
            char r8 = p297qi.C5656b.f21951b
            r2[r4] = r8
            goto L42
        L4d:
            java.lang.String r8 = new java.lang.String
            int r1 = r1 - r4
            r8.<init>(r2, r4, r1)
            return r8
    }
}
