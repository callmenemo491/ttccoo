package p270p6;

/* renamed from: p6.c */
/* loaded from: classes.dex */
public class C5369c {
    /* renamed from: a */
    public static void m11713a(@androidx.annotation.RecentlyNonNull android.os.Parcel r0, int r1, @androidx.annotation.RecentlyNonNull java.lang.Boolean r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            m11724l(r0, r1, r2)
        L8:
            return
        L9:
            r3 = 4
            m11724l(r0, r1, r3)
            boolean r1 = r2.booleanValue()
            r0.writeInt(r1)
            return
    }

    /* renamed from: b */
    public static void m11714b(@androidx.annotation.RecentlyNonNull android.os.Parcel r0, int r1, @androidx.annotation.RecentlyNonNull android.os.Bundle r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            m11724l(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = m11723k(r0, r1)
            r0.writeBundle(r2)
            m11726n(r0, r1)
            return
    }

    /* renamed from: c */
    public static void m11715c(@androidx.annotation.RecentlyNonNull android.os.Parcel r0, int r1, @androidx.annotation.RecentlyNonNull android.os.IBinder r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            m11724l(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = m11723k(r0, r1)
            r0.writeStrongBinder(r2)
            m11726n(r0, r1)
            return
    }

    /* renamed from: d */
    public static void m11716d(@androidx.annotation.RecentlyNonNull android.os.Parcel r0, int r1, @androidx.annotation.RecentlyNonNull long[] r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            m11724l(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = m11723k(r0, r1)
            r0.writeLongArray(r2)
            m11726n(r0, r1)
            return
    }

    /* renamed from: e */
    public static void m11717e(@androidx.annotation.RecentlyNonNull android.os.Parcel r0, int r1, @androidx.annotation.RecentlyNonNull java.lang.Long r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            m11724l(r0, r1, r2)
        L8:
            return
        L9:
            r3 = 8
            m11724l(r0, r1, r3)
            long r1 = r2.longValue()
            r0.writeLong(r1)
            return
    }

    /* renamed from: f */
    public static void m11718f(@androidx.annotation.RecentlyNonNull android.os.Parcel r0, int r1, @androidx.annotation.RecentlyNonNull android.os.Parcelable r2, int r3, boolean r4) {
            if (r2 != 0) goto L9
            if (r4 == 0) goto L8
            r2 = 0
            m11724l(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = m11723k(r0, r1)
            r2.writeToParcel(r0, r3)
            m11726n(r0, r1)
            return
    }

    /* renamed from: g */
    public static void m11719g(@androidx.annotation.RecentlyNonNull android.os.Parcel r0, int r1, @androidx.annotation.RecentlyNonNull java.lang.String r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            m11724l(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = m11723k(r0, r1)
            r0.writeString(r2)
            m11726n(r0, r1)
            return
    }

    /* renamed from: h */
    public static void m11720h(@androidx.annotation.RecentlyNonNull android.os.Parcel r0, int r1, @androidx.annotation.RecentlyNonNull java.util.List<java.lang.String> r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            m11724l(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = m11723k(r0, r1)
            r0.writeStringList(r2)
            m11726n(r0, r1)
            return
    }

    /* renamed from: i */
    public static <T extends android.os.Parcelable> void m11721i(@androidx.annotation.RecentlyNonNull android.os.Parcel r3, int r4, @androidx.annotation.RecentlyNonNull T[] r5, int r6, boolean r7) {
            r0 = 0
            if (r5 != 0) goto L9
            if (r7 == 0) goto L8
            m11724l(r3, r4, r0)
        L8:
            return
        L9:
            int r4 = m11723k(r3, r4)
            int r7 = r5.length
            r3.writeInt(r7)
            r1 = 0
        L12:
            if (r1 >= r7) goto L22
            r2 = r5[r1]
            if (r2 != 0) goto L1c
            r3.writeInt(r0)
            goto L1f
        L1c:
            m11725m(r3, r2, r6)
        L1f:
            int r1 = r1 + 1
            goto L12
        L22:
            m11726n(r3, r4)
            return
    }

    /* renamed from: j */
    public static <T extends android.os.Parcelable> void m11722j(@androidx.annotation.RecentlyNonNull android.os.Parcel r3, int r4, @androidx.annotation.RecentlyNonNull java.util.List<T> r5, boolean r6) {
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            m11724l(r3, r4, r0)
        L8:
            return
        L9:
            int r4 = m11723k(r3, r4)
            int r6 = r5.size()
            r3.writeInt(r6)
            r1 = 0
        L15:
            if (r1 >= r6) goto L29
            java.lang.Object r2 = r5.get(r1)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            if (r2 != 0) goto L23
            r3.writeInt(r0)
            goto L26
        L23:
            m11725m(r3, r2, r0)
        L26:
            int r1 = r1 + 1
            goto L15
        L29:
            m11726n(r3, r4)
            return
    }

    /* renamed from: k */
    public static int m11723k(android.os.Parcel r1, int r2) {
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 | r0
            r1.writeInt(r2)
            r2 = 0
            r1.writeInt(r2)
            int r1 = r1.dataPosition()
            return r1
    }

    /* renamed from: l */
    public static void m11724l(android.os.Parcel r1, int r2, int r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 < r0) goto Lf
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 | r0
            r1.writeInt(r2)
            r1.writeInt(r3)
            return
        Lf:
            int r3 = r3 << 16
            r2 = r2 | r3
            r1.writeInt(r2)
            return
    }

    /* renamed from: m */
    public static <T extends android.os.Parcelable> void m11725m(android.os.Parcel r2, T r3, int r4) {
            int r0 = r2.dataPosition()
            r1 = 1
            r2.writeInt(r1)
            int r1 = r2.dataPosition()
            r3.writeToParcel(r2, r4)
            int r3 = r2.dataPosition()
            r2.setDataPosition(r0)
            int r4 = r3 - r1
            r2.writeInt(r4)
            r2.setDataPosition(r3)
            return
    }

    /* renamed from: n */
    public static void m11726n(android.os.Parcel r2, int r3) {
            int r0 = r2.dataPosition()
            int r1 = r0 - r3
            int r3 = r3 + (-4)
            r2.setDataPosition(r3)
            r2.writeInt(r1)
            r2.setDataPosition(r0)
            return
    }
}
