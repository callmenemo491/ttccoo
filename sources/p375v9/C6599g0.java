package p375v9;

/* renamed from: v9.g0 */
/* loaded from: classes.dex */
public final class C6599g0 implements android.os.Parcelable.Creator<p375v9.C6587a0> {
    public C6599g0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p375v9.C6587a0 createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = p270p6.C5368b.m11710t(r9)
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = r3
            r2 = 0
        L9:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L3b
            int r5 = r9.readInt()
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r7 = 2
            if (r6 == r7) goto L36
            r7 = 3
            if (r6 == r7) goto L31
            r7 = 4
            if (r6 == r7) goto L2c
            r7 = 5
            if (r6 == r7) goto L27
            p270p6.C5368b.m11709s(r9, r5)
            goto L9
        L27:
            boolean r2 = p270p6.C5368b.m11700j(r9, r5)
            goto L9
        L2c:
            boolean r1 = p270p6.C5368b.m11700j(r9, r5)
            goto L9
        L31:
            java.lang.String r4 = p270p6.C5368b.m11695e(r9, r5)
            goto L9
        L36:
            java.lang.String r3 = p270p6.C5368b.m11695e(r9, r5)
            goto L9
        L3b:
            p270p6.C5368b.m11699i(r9, r0)
            v9.a0 r9 = new v9.a0
            r9.<init>(r3, r4, r1, r2)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p375v9.C6587a0[] newArray(int r1) {
            r0 = this;
            v9.a0[] r1 = new p375v9.C6587a0[r1]
            return r1
    }
}
