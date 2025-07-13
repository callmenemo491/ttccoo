package p145i7;

/* renamed from: i7.s */
/* loaded from: classes.dex */
public final class C3110s implements java.lang.annotation.Annotation {

    /* renamed from: a */
    public final int f12498a;

    /* renamed from: b */
    public final p145i7.EnumC3113v f12499b;

    public C3110s(int r1, p145i7.EnumC3113v r2) {
            r0 = this;
            r0.<init>()
            r0.f12498a = r1
            r0.f12499b = r2
            return
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.Class<? extends java.lang.annotation.Annotation> annotationType() {
            r1 = this;
            java.lang.Class<i7.s> r0 = p145i7.C3110s.class
            return r0
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p145i7.C3110s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i7.s r5 = (p145i7.C3110s) r5
            int r1 = r4.f12498a
            int r3 = r5.f12498a
            if (r1 != r3) goto L1d
            i7.v r1 = r4.f12499b
            i7.v r5 = r5.f12499b
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L1d
            return r0
        L1d:
            return r2
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
            r3 = this;
            int r0 = r3.f12498a
            r1 = 14552422(0xde0d66, float:2.0392287E-38)
            r0 = r0 ^ r1
            i7.v r1 = r3.f12499b
            int r1 = r1.hashCode()
            r2 = 2041407134(0x79ad669e, float:1.12543585E35)
            r1 = r1 ^ r2
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@com.google.firebase.encoders.proto.Protobuf"
            r0.<init>(r1)
            java.lang.String r1 = "(tag="
            r0.append(r1)
            int r1 = r2.f12498a
            r0.append(r1)
            java.lang.String r1 = "intEncoding="
            r0.append(r1)
            i7.v r1 = r2.f12499b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
