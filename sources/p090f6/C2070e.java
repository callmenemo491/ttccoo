package p090f6;

/* renamed from: f6.e */
/* loaded from: classes.dex */
public final class C2070e extends p053d7.C1340b implements p090f6.InterfaceC2072g {
    public C2070e(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask"
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p090f6.InterfaceC2072g
    /* renamed from: v0 */
    public final android.graphics.Bitmap mo5493v0(android.net.Uri r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p072e7.C1632i.m4225b(r0, r2)
            r2 = 1
            android.os.Parcel r2 = r1.m3836m2(r2, r0)
            android.os.Parcelable$Creator r0 = android.graphics.Bitmap.CREATOR
            android.os.Parcelable r0 = p072e7.C1632i.m4224a(r2, r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.recycle()
            return r0
    }
}
