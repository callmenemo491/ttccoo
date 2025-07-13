package p287q7;

/* renamed from: q7.j */
/* loaded from: classes.dex */
public final class C5592j extends p270p6.AbstractC5367a implements p201l6.InterfaceC4188h {
    public static final android.os.Parcelable.Creator<p287q7.C5592j> CREATOR = null;

    /* renamed from: Y */
    public final java.util.List<java.lang.String> f21736Y;

    /* renamed from: Z */
    public final java.lang.String f21737Z;

    static {
            q7.i r0 = new q7.i
            r0.<init>()
            p287q7.C5592j.CREATOR = r0
            return
    }

    public C5592j(java.util.List<java.lang.String> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f21736Y = r1
            r0.f21737Z = r2
            return
    }

    @Override // p201l6.InterfaceC4188h
    /* renamed from: F */
    public final com.google.android.gms.common.api.Status mo3030F() {
            r1 = this;
            java.lang.String r0 = r1.f21737Z
            if (r0 == 0) goto L7
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.f5532d0
            return r0
        L7:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.f5534f0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.util.List<java.lang.String> r1 = r3.f21736Y
            r2 = 0
            p270p6.C5369c.m11720h(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r3.f21737Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
