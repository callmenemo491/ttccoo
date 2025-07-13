package p071e6;

/* renamed from: e6.n */
/* loaded from: classes.dex */
public final class C1539n extends p053d7.C1340b implements p071e6.InterfaceC1545t {
    public C1539n(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.media.IImagePicker"
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p071e6.InterfaceC1545t
    /* renamed from: e */
    public final p408x6.InterfaceC6957a mo4108e() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 2
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            r0.recycle()
            return r1
    }
}
