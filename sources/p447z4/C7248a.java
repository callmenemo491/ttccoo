package p447z4;

/* renamed from: z4.a */
/* loaded from: classes.dex */
public final class C7248a implements p427y4.C7110a.b {
    public static final android.os.Parcelable.Creator<p447z4.C7248a> CREATOR = null;

    /* renamed from: Y */
    public final int f27852Y;

    /* renamed from: Z */
    public final java.lang.String f27853Z;

    /* renamed from: z4.a$a */
    public class a implements android.os.Parcelable.Creator<p447z4.C7248a> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p447z4.C7248a createFromParcel(android.os.Parcel r3) {
                r2 = this;
                java.lang.String r0 = r3.readString()
                java.util.Objects.requireNonNull(r0)
                int r3 = r3.readInt()
                z4.a r1 = new z4.a
                r1.<init>(r3, r0)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public p447z4.C7248a[] newArray(int r1) {
                r0 = this;
                z4.a[] r1 = new p447z4.C7248a[r1]
                return r1
        }
    }

    static {
            z4.a$a r0 = new z4.a$a
            r0.<init>()
            p447z4.C7248a.CREATOR = r0
            return
    }

    public C7248a(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f27852Y = r1
            r0.f27853Z = r2
            return
    }

    @Override // p427y4.C7110a.b
    /* renamed from: D */
    public /* synthetic */ p088f4.C2003e0 mo30D() {
            r1 = this;
            f4.e0 r0 = p427y4.C7111b.m14222b(r1)
            return r0
    }

    @Override // p427y4.C7110a.b
    /* renamed from: O */
    public /* synthetic */ byte[] mo31O() {
            r1 = this;
            byte[] r0 = p427y4.C7111b.m14221a(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p427y4.C7110a.b
    /* renamed from: p */
    public /* synthetic */ void mo32p(p088f4.C2021k0.b r1) {
            r0 = this;
            p427y4.C7111b.m14223c(r0, r1)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f27852Y
            java.lang.String r1 = r4.f27853Z
            r2 = 33
            int r2 = p064e.C1489c.m4038a(r1, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Ait(controlCode="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ",url="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f27853Z
            r1.writeString(r2)
            int r2 = r0.f27852Y
            r1.writeInt(r2)
            return
    }
}
