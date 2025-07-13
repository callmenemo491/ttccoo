package p071e6;

/* renamed from: e6.u */
/* loaded from: classes.dex */
public final class C1546u extends p053d7.C1340b implements p071e6.InterfaceC1547v {
    public C1546u(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.media.INotificationActionsProvider"
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p071e6.InterfaceC1547v
    /* renamed from: e */
    public final int[] mo4110e() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 4
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            int[] r1 = r0.createIntArray()
            r0.recycle()
            return r1
    }

    @Override // p071e6.InterfaceC1547v
    /* renamed from: h */
    public final java.util.List<p071e6.C1527d> mo4111h() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 3
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            android.os.Parcelable$Creator<e6.d> r1 = p071e6.C1527d.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            r0.recycle()
            return r1
    }
}
