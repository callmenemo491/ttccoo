package p036c6;

/* renamed from: c6.p0 */
/* loaded from: classes.dex */
public final class C0904p0 implements android.os.Parcelable.Creator<p036c6.C0895l> {
    public C0904p0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0895l createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = p270p6.C5368b.m11710t(r13)
            r1 = 0
            r2 = 0
            r3 = 0
            r7 = r1
            r8 = r7
            r9 = r8
            r10 = r3
            r6 = 0
        Ld:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L50
            int r1 = r13.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 2
            if (r2 == r3) goto L4a
            r3 = 3
            if (r2 == r3) goto L44
            r3 = 4
            if (r2 == r3) goto L3c
            r3 = 5
            if (r2 == r3) goto L34
            r3 = 6
            if (r2 == r3) goto L2e
            p270p6.C5368b.m11709s(r13, r1)
            goto Ld
        L2e:
            double r1 = p270p6.C5368b.m11702l(r13, r1)
            r10 = r1
            goto Ld
        L34:
            android.os.Parcelable$Creator<n6.a> r2 = p233n6.C4691a.CREATOR
            java.util.ArrayList r1 = p270p6.C5368b.m11698h(r13, r1, r2)
            r9 = r1
            goto Ld
        L3c:
            android.os.Parcelable$Creator<c6.k> r2 = p036c6.C0893k.CREATOR
            java.util.ArrayList r1 = p270p6.C5368b.m11698h(r13, r1, r2)
            r8 = r1
            goto Ld
        L44:
            java.lang.String r1 = p270p6.C5368b.m11695e(r13, r1)
            r7 = r1
            goto Ld
        L4a:
            int r1 = p270p6.C5368b.m11705o(r13, r1)
            r6 = r1
            goto Ld
        L50:
            p270p6.C5368b.m11699i(r13, r0)
            c6.l r13 = new c6.l
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0895l[] newArray(int r1) {
            r0 = this;
            c6.l[] r1 = new p036c6.C0895l[r1]
            return r1
    }
}
