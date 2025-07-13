package p248o6;

/* renamed from: o6.t0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4935t0 extends p110g7.BinderC2295a implements p248o6.InterfaceC4931r0 {

    /* renamed from: a */
    public static final /* synthetic */ int f19543a = 0;

    public AbstractBinderC4935t0() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            r1.<init>(r0)
            return
    }

    @Override // p110g7.BinderC2295a
    /* renamed from: v */
    public final boolean mo6060v(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            r2 = 1
            if (r1 == r2) goto L14
            r4 = 2
            if (r1 == r4) goto L8
            r1 = 0
            return r1
        L8:
            r1 = r0
            k6.n r1 = (p184k6.AbstractBinderC3711n) r1
            int r1 = r1.f16424b
            r3.writeNoException()
            r3.writeInt(r1)
            goto L21
        L14:
            r1 = r0
            k6.n r1 = (p184k6.AbstractBinderC3711n) r1
            x6.a r1 = r1.mo8176b()
            r3.writeNoException()
            p110g7.C2296b.m6062b(r3, r1)
        L21:
            return r2
    }
}
