package p375v9;

/* renamed from: v9.l0 */
/* loaded from: classes.dex */
public final class C6609l0 implements android.os.Parcelable.Creator<p375v9.C6594e> {
    public C6609l0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p375v9.C6594e createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = p270p6.C5368b.m11710t(r10)
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L4a
            int r1 = r10.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L44
            r3 = 2
            if (r2 == r3) goto L3e
            r3 = 3
            if (r2 == r3) goto L38
            r3 = 4
            if (r2 == r3) goto L32
            r3 = 5
            if (r2 == r3) goto L2c
            p270p6.C5368b.m11709s(r10, r1)
            goto Lb
        L2c:
            boolean r1 = p270p6.C5368b.m11700j(r10, r1)
            r8 = r1
            goto Lb
        L32:
            java.lang.String r1 = p270p6.C5368b.m11695e(r10, r1)
            r7 = r1
            goto Lb
        L38:
            java.lang.String r1 = p270p6.C5368b.m11695e(r10, r1)
            r6 = r1
            goto Lb
        L3e:
            java.lang.String r1 = p270p6.C5368b.m11695e(r10, r1)
            r5 = r1
            goto Lb
        L44:
            java.lang.String r1 = p270p6.C5368b.m11695e(r10, r1)
            r4 = r1
            goto Lb
        L4a:
            p270p6.C5368b.m11699i(r10, r0)
            v9.e r10 = new v9.e
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p375v9.C6594e[] newArray(int r1) {
            r0 = this;
            v9.e[] r1 = new p375v9.C6594e[r1]
            return r1
    }
}
