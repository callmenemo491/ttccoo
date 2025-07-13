package p270p6;

/* renamed from: p6.b */
/* loaded from: classes.dex */
public class C5368b {

    /* renamed from: p6.b$a */
    public static class a extends java.lang.RuntimeException {
        public a(@androidx.annotation.RecentlyNonNull java.lang.String r4, @androidx.annotation.RecentlyNonNull android.os.Parcel r5) {
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                r1 = 41
                int r1 = p064e.C1489c.m4038a(r4, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
        }
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public static android.os.Bundle m11691a(@androidx.annotation.RecentlyNonNull android.os.Parcel r2, int r3) {
            int r3 = m11708r(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            android.os.Bundle r1 = r2.readBundle()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: b */
    public static int[] m11692b(@androidx.annotation.RecentlyNonNull android.os.Parcel r2, int r3) {
            int r3 = m11708r(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            int[] r1 = r2.createIntArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: c */
    public static long[] m11693c(@androidx.annotation.RecentlyNonNull android.os.Parcel r2, int r3) {
            int r3 = m11708r(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            long[] r1 = r2.createLongArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: d */
    public static <T extends android.os.Parcelable> T m11694d(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2, @androidx.annotation.RecentlyNonNull android.os.Parcelable.Creator<T> r3) {
            int r2 = m11708r(r1, r2)
            int r0 = r1.dataPosition()
            if (r2 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.Object r3 = r3.createFromParcel(r1)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            int r0 = r0 + r2
            r1.setDataPosition(r0)
            return r3
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: e */
    public static java.lang.String m11695e(@androidx.annotation.RecentlyNonNull android.os.Parcel r2, int r3) {
            int r3 = m11708r(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.lang.String r1 = r2.readString()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: f */
    public static java.util.ArrayList<java.lang.String> m11696f(@androidx.annotation.RecentlyNonNull android.os.Parcel r2, int r3) {
            int r3 = m11708r(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.util.ArrayList r1 = r2.createStringArrayList()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: g */
    public static <T> T[] m11697g(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2, @androidx.annotation.RecentlyNonNull android.os.Parcelable.Creator<T> r3) {
            int r2 = m11708r(r1, r2)
            int r0 = r1.dataPosition()
            if (r2 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.Object[] r3 = r1.createTypedArray(r3)
            int r0 = r0 + r2
            r1.setDataPosition(r0)
            return r3
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: h */
    public static <T> java.util.ArrayList<T> m11698h(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2, @androidx.annotation.RecentlyNonNull android.os.Parcelable.Creator<T> r3) {
            int r2 = m11708r(r1, r2)
            int r0 = r1.dataPosition()
            if (r2 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.util.ArrayList r3 = r1.createTypedArrayList(r3)
            int r0 = r0 + r2
            r1.setDataPosition(r0)
            return r3
    }

    /* renamed from: i */
    public static void m11699i(@androidx.annotation.RecentlyNonNull android.os.Parcel r3, int r4) {
            int r0 = r3.dataPosition()
            if (r0 != r4) goto L7
            return
        L7:
            p6.b$a r0 = new p6.b$a
            r1 = 37
            java.lang.String r2 = "Overread allowed size end="
            java.lang.String r4 = p064e.C1490d.m4039a(r1, r2, r4)
            r0.<init>(r4, r3)
            throw r0
    }

    /* renamed from: j */
    public static boolean m11700j(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2) {
            r0 = 4
            m11711u(r1, r2, r0)
            int r1 = r1.readInt()
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: k */
    public static java.lang.Boolean m11701k(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2) {
            int r2 = m11708r(r1, r2)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r0 = 4
            m11712v(r1, r2, r0)
            int r1 = r1.readInt()
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    /* renamed from: l */
    public static double m11702l(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2) {
            r0 = 8
            m11711u(r1, r2, r0)
            double r1 = r1.readDouble()
            return r1
    }

    /* renamed from: m */
    public static float m11703m(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2) {
            r0 = 4
            m11711u(r1, r2, r0)
            float r1 = r1.readFloat()
            return r1
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: n */
    public static android.os.IBinder m11704n(@androidx.annotation.RecentlyNonNull android.os.Parcel r2, int r3) {
            int r3 = m11708r(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            android.os.IBinder r1 = r2.readStrongBinder()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    /* renamed from: o */
    public static int m11705o(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2) {
            r0 = 4
            m11711u(r1, r2, r0)
            int r1 = r1.readInt()
            return r1
    }

    /* renamed from: p */
    public static long m11706p(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2) {
            r0 = 8
            m11711u(r1, r2, r0)
            long r1 = r1.readLong()
            return r1
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: q */
    public static java.lang.Long m11707q(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2) {
            int r2 = m11708r(r1, r2)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r0 = 8
            m11712v(r1, r2, r0)
            long r1 = r1.readLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
    }

    /* renamed from: r */
    public static int m11708r(@androidx.annotation.RecentlyNonNull android.os.Parcel r2, int r3) {
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r3 & r0
            if (r1 == r0) goto Ld
            int r2 = r3 >> 16
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            return r2
        Ld:
            int r2 = r2.readInt()
            return r2
    }

    /* renamed from: s */
    public static void m11709s(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2) {
            int r2 = m11708r(r1, r2)
            int r0 = r1.dataPosition()
            int r0 = r0 + r2
            r1.setDataPosition(r0)
            return
    }

    /* renamed from: t */
    public static int m11710t(@androidx.annotation.RecentlyNonNull android.os.Parcel r6) {
            int r0 = r6.readInt()
            int r1 = m11708r(r6, r0)
            int r2 = r6.dataPosition()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            r4 = 20293(0x4f45, float:2.8437E-41)
            if (r3 == r4) goto L34
            p6.b$a r1 = new p6.b$a
            java.lang.String r2 = "Expected object header. Got 0x"
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L2b
            java.lang.String r0 = r2.concat(r0)
            goto L30
        L2b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L30:
            r1.<init>(r0, r6)
            throw r1
        L34:
            int r1 = r1 + r2
            if (r1 < r2) goto L3e
            int r0 = r6.dataSize()
            if (r1 > r0) goto L3e
            return r1
        L3e:
            p6.b$a r0 = new p6.b$a
            r3 = 54
            java.lang.String r4 = "Size read is invalid start="
            java.lang.String r5 = " end="
            java.lang.String r1 = p304r4.C5785f.m12134a(r3, r4, r2, r5, r1)
            r0.<init>(r1, r6)
            throw r0
    }

    /* renamed from: u */
    public static void m11711u(android.os.Parcel r4, int r5, int r6) {
            int r5 = m11708r(r4, r5)
            if (r5 != r6) goto L7
            return
        L7:
            p6.b$a r0 = new p6.b$a
            java.lang.String r1 = java.lang.Integer.toHexString(r5)
            r2 = 46
            int r2 = p064e.C1489c.m4038a(r1, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Expected size "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r6 = " got "
            r3.append(r6)
            r3.append(r5)
            java.lang.String r5 = " (0x"
            java.lang.String r6 = ")"
            java.lang.String r5 = p083f.C1932s.m4774a(r3, r5, r1, r6)
            r0.<init>(r5, r4)
            throw r0
    }

    /* renamed from: v */
    public static void m11712v(android.os.Parcel r4, int r5, int r6) {
            if (r5 != r6) goto L3
            return
        L3:
            p6.b$a r0 = new p6.b$a
            java.lang.String r1 = java.lang.Integer.toHexString(r5)
            r2 = 46
            int r2 = p064e.C1489c.m4038a(r1, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Expected size "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r6 = " got "
            r3.append(r6)
            r3.append(r5)
            java.lang.String r5 = " (0x"
            java.lang.String r6 = ")"
            java.lang.String r5 = p083f.C1932s.m4774a(r3, r5, r1, r6)
            r0.<init>(r5, r4)
            throw r0
    }
}
