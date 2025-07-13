package p124h7;

/* renamed from: h7.t2 */
/* loaded from: classes.dex */
public final class C2866t2 {
    static {
            java.lang.Class<h7.t2> r0 = p124h7.C2866t2.class
            r0.getClassLoader()
            return
    }

    public C2866t2() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static <T extends android.os.Parcelable> T m7152a(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
            int r0 = r1.readInt()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.createFromParcel(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            return r1
    }

    /* renamed from: b */
    public static void m7153b(android.os.Parcel r2, android.os.Parcelable r3) {
            r0 = 0
            if (r3 != 0) goto L7
            r2.writeInt(r0)
            return
        L7:
            r1 = 1
            r2.writeInt(r1)
            r3.writeToParcel(r2, r0)
            return
    }
}
