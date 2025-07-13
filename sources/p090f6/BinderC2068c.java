package p090f6;

/* renamed from: f6.c */
/* loaded from: classes.dex */
public final class BinderC2068c extends p072e7.BinderC1622h implements p090f6.InterfaceC2073h {

    /* renamed from: a */
    public final /* synthetic */ p090f6.AsyncTaskC2069d f9472a;

    public BinderC2068c(p090f6.AsyncTaskC2069d r1) {
            r0 = this;
            r0.f9472a = r1
            java.lang.String r1 = "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher"
            r0.<init>(r1)
            return
    }

    @Override // p072e7.BinderC1622h
    /* renamed from: v */
    public final boolean mo3764v(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
            r5 = this;
            r9 = 0
            r0 = 2
            r1 = 1
            if (r6 == r1) goto L12
            if (r6 == r0) goto L8
            goto L31
        L8:
            r8.writeNoException()
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r8.writeInt(r6)
            goto L30
        L12:
            long r2 = r7.readLong()
            long r6 = r7.readLong()
            f6.d r4 = r5.f9472a
            java.lang.Long[] r0 = new java.lang.Long[r0]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r9] = r2
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0[r1] = r6
            p090f6.AsyncTaskC2069d.m5492a(r4, r0)
            r8.writeNoException()
        L30:
            r9 = 1
        L31:
            return r9
    }
}
