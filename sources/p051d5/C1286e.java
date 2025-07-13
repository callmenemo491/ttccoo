package p051d5;

/* renamed from: d5.e */
/* loaded from: classes.dex */
public final class C1286e extends p051d5.AbstractC1289h {
    public static final android.os.Parcelable.Creator<p051d5.C1286e> CREATOR = null;

    /* renamed from: Z */
    public final java.lang.String f6778Z;

    /* renamed from: a0 */
    public final java.lang.String f6779a0;

    /* renamed from: b0 */
    public final java.lang.String f6780b0;

    /* renamed from: d5.e$a */
    public class a implements android.os.Parcelable.Creator<p051d5.C1286e> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1286e createFromParcel(android.os.Parcel r2) {
                r1 = this;
                d5.e r0 = new d5.e
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1286e[] newArray(int r1) {
                r0 = this;
                d5.e[] r1 = new p051d5.C1286e[r1]
                return r1
        }
    }

    static {
            d5.e$a r0 = new d5.e$a
            r0.<init>()
            p051d5.C1286e.CREATOR = r0
            return
    }

    public C1286e(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = "COMM"
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            int r1 = p371v5.C6552b0.f25624a
            r2.f6778Z = r0
            java.lang.String r0 = r3.readString()
            r2.f6779a0 = r0
            java.lang.String r3 = r3.readString()
            r2.f6780b0 = r3
            return
    }

    public C1286e(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "COMM"
            r1.<init>(r0)
            r1.f6778Z = r2
            r1.f6779a0 = r3
            r1.f6780b0 = r4
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
            java.lang.Class<d5.e> r2 = p051d5.C1286e.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L33
        L10:
            d5.e r5 = (p051d5.C1286e) r5
            java.lang.String r2 = r4.f6779a0
            java.lang.String r3 = r5.f6779a0
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.f6778Z
            java.lang.String r3 = r5.f6778Z
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.f6780b0
            java.lang.String r5 = r5.f6780b0
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
            java.lang.String r0 = r3.f6778Z
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            r2 = 527(0x20f, float:7.38E-43)
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.f6779a0
            if (r0 == 0) goto L19
            int r0 = r0.hashCode()
            goto L1a
        L19:
            r0 = 0
        L1a:
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.f6780b0
            if (r0 == 0) goto L25
            int r1 = r0.hashCode()
        L25:
            int r2 = r2 + r1
            return r2
    }

    @Override // p051d5.AbstractC1289h
    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.f6790Y
            java.lang.String r1 = r6.f6778Z
            java.lang.String r2 = r6.f6779a0
            r3 = 25
            int r3 = p064e.C1489c.m4038a(r0, r3)
            int r3 = p064e.C1489c.m4038a(r1, r3)
            int r3 = p064e.C1489c.m4038a(r2, r3)
            java.lang.String r4 = ": language="
            java.lang.String r5 = ", description="
            java.lang.StringBuilder r0 = p064e.C1491e.m4040a(r3, r0, r4, r1, r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f6790Y
            r1.writeString(r2)
            java.lang.String r2 = r0.f6778Z
            r1.writeString(r2)
            java.lang.String r2 = r0.f6780b0
            r1.writeString(r2)
            return
    }
}
