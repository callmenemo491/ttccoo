package p249o7;

/* renamed from: o7.q */
/* loaded from: classes.dex */
public final class C5077q extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p249o7.C5077q> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f19951Y;

    /* renamed from: Z */
    public final p249o7.C5061o f19952Z;

    /* renamed from: a0 */
    public final java.lang.String f19953a0;

    /* renamed from: b0 */
    public final long f19954b0;

    static {
            o7.r r0 = new o7.r
            r0.<init>()
            p249o7.C5077q.CREATOR = r0
            return
    }

    public C5077q(java.lang.String r1, p249o7.C5061o r2, java.lang.String r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.f19951Y = r1
            r0.f19952Z = r2
            r0.f19953a0 = r3
            r0.f19954b0 = r4
            return
    }

    public C5077q(p249o7.C5077q r2, long r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = r2.f19951Y
            r1.f19951Y = r0
            o7.o r0 = r2.f19952Z
            r1.f19952Z = r0
            java.lang.String r2 = r2.f19953a0
            r1.f19953a0 = r2
            r1.f19954b0 = r3
            return
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.String r0 = r8.f19953a0
            java.lang.String r1 = r8.f19951Y
            o7.o r2 = r8.f19952Z
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r5 = r2.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 21
            int r3 = androidx.appcompat.widget.C0267d.m705a(r3, r7, r4, r5)
            r6.<init>(r3)
            java.lang.String r3 = "origin="
            java.lang.String r4 = ",name="
            p179k1.C3661s.m8090a(r6, r3, r0, r4, r1)
            java.lang.String r0 = ",params="
            java.lang.String r0 = p346u.C6269n.m12888a(r6, r0, r2)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            p249o7.C5085r.m11415a(r0, r1, r2)
            return
    }
}
