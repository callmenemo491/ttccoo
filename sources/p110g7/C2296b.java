package p110g7;

/* renamed from: g7.b */
/* loaded from: classes.dex */
public class C2296b {

    /* renamed from: a */
    public static final /* synthetic */ int f10516a = 0;

    static {
            java.lang.Class<g7.b> r0 = p110g7.C2296b.class
            r0.getClassLoader()
            return
    }

    public C2296b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static <T extends android.os.Parcelable> T m6061a(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
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
    public static void m6062b(android.os.Parcel r0, android.os.IInterface r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto L8
        L4:
            android.os.IBinder r1 = r1.asBinder()
        L8:
            r0.writeStrongBinder(r1)
            return
    }

    /* renamed from: c */
    public static void m6063c(android.os.Parcel r2, android.os.Parcelable r3) {
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
