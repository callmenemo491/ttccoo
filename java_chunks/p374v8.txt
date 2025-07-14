package p374v8;

/* renamed from: v8.a */
/* loaded from: classes.dex */
public class C6585a extends p320s0.AbstractC5943a {
    public static final android.os.Parcelable.Creator<p374v8.C6585a> CREATOR = null;

    /* renamed from: a0 */
    public final p319s.C5941h<java.lang.String, android.os.Bundle> f25756a0;

    /* renamed from: v8.a$a */
    public static class a implements android.os.Parcelable.ClassLoaderCreator<p374v8.C6585a> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public java.lang.Object createFromParcel(android.os.Parcel r3) {
                r2 = this;
                v8.a r0 = new v8.a
                r1 = 0
                r0.<init>(r3, r1, r1)
                return r0
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public p374v8.C6585a createFromParcel(android.os.Parcel r3, java.lang.ClassLoader r4) {
                r2 = this;
                v8.a r0 = new v8.a
                r1 = 0
                r0.<init>(r3, r4, r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public java.lang.Object[] newArray(int r1) {
                r0 = this;
                v8.a[] r1 = new p374v8.C6585a[r1]
                return r1
        }
    }

    static {
            v8.a$a r0 = new v8.a$a
            r0.<init>()
            p374v8.C6585a.CREATOR = r0
            return
    }

    public C6585a(android.os.Parcel r5, java.lang.ClassLoader r6, p374v8.C6585a.a r7) {
            r4 = this;
            r4.<init>(r5, r6)
            int r6 = r5.readInt()
            java.lang.String[] r7 = new java.lang.String[r6]
            r5.readStringArray(r7)
            android.os.Bundle[] r0 = new android.os.Bundle[r6]
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            r5.readTypedArray(r0, r1)
            s.h r5 = new s.h
            r5.<init>(r6)
            r4.f25756a0 = r5
            r5 = 0
        L1b:
            if (r5 >= r6) goto L29
            s.h<java.lang.String, android.os.Bundle> r1 = r4.f25756a0
            r2 = r7[r5]
            r3 = r0[r5]
            r1.put(r2, r3)
            int r5 = r5 + 1
            goto L1b
        L29:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ExtendableSavedState{"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " states="
            r0.append(r1)
            s.h<java.lang.String, android.os.Bundle> r1 = r2.f25756a0
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p320s0.AbstractC5943a, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            android.os.Parcelable r0 = r5.f22819Y
            r6.writeParcelable(r0, r7)
            s.h<java.lang.String, android.os.Bundle> r7 = r5.f25756a0
            int r7 = r7.f22812a0
            r6.writeInt(r7)
            java.lang.String[] r0 = new java.lang.String[r7]
            android.os.Bundle[] r1 = new android.os.Bundle[r7]
            r2 = 0
            r3 = 0
        L12:
            if (r3 >= r7) goto L2b
            s.h<java.lang.String, android.os.Bundle> r4 = r5.f25756a0
            java.lang.Object r4 = r4.m12343h(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0[r3] = r4
            s.h<java.lang.String, android.os.Bundle> r4 = r5.f25756a0
            java.lang.Object r4 = r4.m12344l(r3)
            android.os.Bundle r4 = (android.os.Bundle) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto L12
        L2b:
            r6.writeStringArray(r0)
            r6.writeTypedArray(r1, r2)
            return
    }
}
