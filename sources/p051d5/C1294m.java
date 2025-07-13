package p051d5;

/* renamed from: d5.m */
/* loaded from: classes.dex */
public final class C1294m extends p051d5.AbstractC1289h {
    public static final android.os.Parcelable.Creator<p051d5.C1294m> CREATOR = null;

    /* renamed from: Z */
    public final java.lang.String f6803Z;

    /* renamed from: a0 */
    public final java.lang.String f6804a0;

    /* renamed from: d5.m$a */
    public class a implements android.os.Parcelable.Creator<p051d5.C1294m> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1294m createFromParcel(android.os.Parcel r2) {
                r1 = this;
                d5.m r0 = new d5.m
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1294m[] newArray(int r1) {
                r0 = this;
                d5.m[] r1 = new p051d5.C1294m[r1]
                return r1
        }
    }

    static {
            d5.m$a r0 = new d5.m$a
            r0.<init>()
            p051d5.C1294m.CREATOR = r0
            return
    }

    public C1294m(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = p371v5.C6552b0.f25624a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f6803Z = r0
            java.lang.String r3 = r3.readString()
            r2.f6804a0 = r3
            return
    }

    public C1294m(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f6803Z = r2
            r0.f6804a0 = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L33
            java.lang.Class<d5.m> r2 = p051d5.C1294m.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L33
        L10:
            d5.m r5 = (p051d5.C1294m) r5
            java.lang.String r2 = r4.f6790Y
            java.lang.String r3 = r5.f6790Y
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.f6803Z
            java.lang.String r3 = r5.f6803Z
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.f6804a0
            java.lang.String r5 = r5.f6804a0
            boolean r5 = p371v5.C6552b0.m13308a(r2, r5)
            if (r5 == 0) goto L31
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
        L33:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f6790Y
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            java.lang.String r1 = r3.f6803Z
            r2 = 0
            if (r1 == 0) goto L14
            int r1 = r1.hashCode()
            goto L15
        L14:
            r1 = 0
        L15:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.f6804a0
            if (r1 == 0) goto L20
            int r2 = r1.hashCode()
        L20:
            int r0 = r0 + r2
            return r0
    }

    @Override // p051d5.AbstractC1289h
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.f6790Y
            java.lang.String r1 = r4.f6804a0
            r2 = 6
            int r2 = p064e.C1489c.m4038a(r0, r2)
            int r2 = p064e.C1489c.m4038a(r1, r2)
            java.lang.String r3 = ": url="
            java.lang.String r0 = p088f4.C2035p.m5377a(r2, r0, r3, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f6790Y
            r1.writeString(r2)
            java.lang.String r2 = r0.f6803Z
            r1.writeString(r2)
            java.lang.String r2 = r0.f6804a0
            r1.writeString(r2)
            return
    }
}
