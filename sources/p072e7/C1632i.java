package p072e7;

/* renamed from: e7.i */
/* loaded from: classes.dex */
public final class C1632i {

    /* renamed from: a */
    public static final /* synthetic */ int f7582a = 0;

    static {
            java.lang.Class<e7.i> r0 = p072e7.C1632i.class
            r0.getClassLoader()
            return
    }

    public C1632i() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static <T extends android.os.Parcelable> T m4224a(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
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
    public static void m4225b(android.os.Parcel r2, android.os.Parcelable r3) {
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

    /* renamed from: c */
    public static void m4226c(android.os.Parcel r1, android.os.Parcelable r2) {
            if (r2 != 0) goto L7
            r2 = 0
            r1.writeInt(r2)
            return
        L7:
            r0 = 1
            r1.writeInt(r0)
            r2.writeToParcel(r1, r0)
            return
    }

    /* renamed from: d */
    public static void m4227d(android.os.Parcel r0, android.os.IInterface r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto L8
        L4:
            android.os.IBinder r1 = r1.asBinder()
        L8:
            r0.writeStrongBinder(r1)
            return
    }
}
