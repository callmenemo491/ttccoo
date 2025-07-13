package p124h7;

/* renamed from: h7.gf */
/* loaded from: classes.dex */
public final class C2645gf extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2645gf> CREATOR = null;

    /* renamed from: Y */
    public final int f11557Y;

    /* renamed from: Z */
    public java.util.List<java.lang.String> f11558Z;

    static {
            h7.hf r0 = new h7.hf
            r0.<init>()
            p124h7.C2645gf.CREATOR = r0
            return
    }

    public C2645gf() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public C2645gf(int r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            r1.<init>()
            r1.f11557Y = r2
            if (r3 == 0) goto L29
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L29
            r2 = 0
        Le:
            int r0 = r3.size()
            if (r2 >= r0) goto L24
            java.lang.Object r0 = r3.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = p353u6.C6347j.m12998a(r0)
            r3.set(r2, r0)
            int r2 = r2 + 1
            goto Le
        L24:
            java.util.List r2 = java.util.Collections.unmodifiableList(r3)
            goto L2d
        L29:
            java.util.List r2 = java.util.Collections.emptyList()
        L2d:
            r1.f11558Z = r2
            return
    }

    public C2645gf(java.util.List<java.lang.String> r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f11557Y = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f11558Z = r0
            if (r2 == 0) goto L1a
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1a
            java.util.List<java.lang.String> r0 = r1.f11558Z
            r0.addAll(r2)
        L1a:
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            int r1 = r3.f11557Y
            r2 = 4
            p270p6.C5369c.m11724l(r4, r0, r2)
            r4.writeInt(r1)
            r0 = 2
            java.util.List<java.lang.String> r1 = r3.f11558Z
            r2 = 0
            p270p6.C5369c.m11720h(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
