package p051d5;

/* renamed from: d5.b */
/* loaded from: classes.dex */
public final class C1283b extends p051d5.AbstractC1289h {
    public static final android.os.Parcelable.Creator<p051d5.C1283b> CREATOR = null;

    /* renamed from: Z */
    public final byte[] f6766Z;

    /* renamed from: d5.b$a */
    public class a implements android.os.Parcelable.Creator<p051d5.C1283b> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1283b createFromParcel(android.os.Parcel r2) {
                r1 = this;
                d5.b r0 = new d5.b
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1283b[] newArray(int r1) {
                r0 = this;
                d5.b[] r1 = new p051d5.C1283b[r1]
                return r1
        }
    }

    static {
            d5.b$a r0 = new d5.b$a
            r0.<init>()
            p051d5.C1283b.CREATOR = r0
            return
    }

    public C1283b(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = p371v5.C6552b0.f25624a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f6766Z = r3
            return
    }

    public C1283b(java.lang.String r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f6766Z = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class<d5.b> r2 = p051d5.C1283b.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            d5.b r5 = (p051d5.C1283b) r5
            java.lang.String r2 = r4.f6790Y
            java.lang.String r3 = r5.f6790Y
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            byte[] r2 = r4.f6766Z
            byte[] r5 = r5.f6766Z
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        L29:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f6790Y
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            byte[] r1 = r3.f6766Z
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f6790Y
            r1.writeString(r2)
            byte[] r2 = r0.f6766Z
            r1.writeByteArray(r2)
            return
    }
}
