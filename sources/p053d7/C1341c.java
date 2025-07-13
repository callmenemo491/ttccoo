package p053d7;

/* renamed from: d7.c */
/* loaded from: classes.dex */
public class C1341c {

    /* renamed from: a */
    public static final /* synthetic */ int f6855a = 0;

    static {
            java.lang.Class<d7.c> r0 = p053d7.C1341c.class
            r0.getClassLoader()
            return
    }

    public C1341c() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static <T extends android.os.Parcelable> T m3841a(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
            int r0 = r1.readInt()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.createFromParcel(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            return r1
    }
}
