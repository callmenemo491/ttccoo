package p287q7;

/* renamed from: q7.b */
/* loaded from: classes.dex */
public final class C5584b extends p270p6.AbstractC5367a implements p201l6.InterfaceC4188h {
    public static final android.os.Parcelable.Creator<p287q7.C5584b> CREATOR = null;

    /* renamed from: Y */
    public final int f21733Y;

    /* renamed from: Z */
    public int f21734Z;

    /* renamed from: a0 */
    public android.content.Intent f21735a0;

    static {
            q7.d r0 = new q7.d
            r0.<init>()
            p287q7.C5584b.CREATOR = r0
            return
    }

    public C5584b() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.f21733Y = r0
            r0 = 0
            r1.f21734Z = r0
            r0 = 0
            r1.f21735a0 = r0
            return
    }

    public C5584b(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            r0.<init>()
            r0.f21733Y = r1
            r0.f21734Z = r2
            r0.f21735a0 = r3
            return
    }

    @Override // p201l6.InterfaceC4188h
    /* renamed from: F */
    public final com.google.android.gms.common.api.Status mo3030F() {
            r1 = this;
            int r0 = r1.f21734Z
            if (r0 != 0) goto L7
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.f5532d0
            return r0
        L7:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.f5534f0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 1
            int r2 = r4.f21733Y
            r3 = 4
            p270p6.C5369c.m11724l(r5, r1, r3)
            r5.writeInt(r2)
            r1 = 2
            int r2 = r4.f21734Z
            p270p6.C5369c.m11724l(r5, r1, r3)
            r5.writeInt(r2)
            r1 = 3
            android.content.Intent r2 = r4.f21735a0
            r3 = 0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
